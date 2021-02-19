package top.zhuchl.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import top.zhuchl.spring.service.GetFileService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @author zclys
 * @date 2021/2/1 9:09
 */
@Controller
@RequestMapping("web/file")
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private GetFileService fileService;

    /**
     * 单文件上传
     *
     * @param file 文件对象
     * @return
     */
    @RequestMapping(value = "upFile1", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> testSingleFile(@RequestParam(value = "file1") MultipartFile file,
                                              ModelAndView mv) {
        logger.info("文件上传测试");
        mv.setView(new MappingJackson2JsonView());
        Map<String, Object> resMap = mv.getModelMap();
        Map<String, Object> body = (Map<String, Object>) resMap.get("body");
        try {
            fileService.saveFile(file);
            body.put("status", "000000");
            body.put("message", "上传成功");
        } catch (IOException e) {
            logger.info("保存本地本地文件失败，原因：{}", e.getCause());
            body.put("status", "999999");
            body.put("message", "上传失败:" + e.getMessage());
        }
        return resMap;
    }

    @RequestMapping(value = "upFile2", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Map<String, Object> testMultipartFile(@RequestParam MultipartFile[] files,
                                                 ModelAndView mv, @RequestParam(value = "desc", required = false) String desc) {
        logger.info("多文件上传测试");
        mv.setView(new MappingJackson2JsonView());
        Map<String, Object> resMap = mv.getModelMap();
        Map<String, Object> body = (Map<String, Object>) resMap.get("body");
        if (files.length <= 0) {
            body.put("status", "999999");
            body.put("message", "上传失败，文件为空");
            return resMap;
        }
        for (MultipartFile file : files) {
            try {
                fileService.saveFile(file);
                body.put("status", "000000");
                body.put("message", "上传成功");
            } catch (IOException e) {
                logger.info("保存本地本地文件失败，原因：{}", e.getCause());
                body.put("status", "999999");
                body.put("message", "上传失败:" + e.getMessage());
                continue;
            }
        }
        return resMap;
    }

    @RequestMapping("download")
    public ResponseEntity<byte[]> downloadSingleFile(HttpServletRequest request) throws IOException {
        //1.得到要下载的文件的流
        String location = "";
        //找到下载文件的真实路径
        ServletContext context = request.getServletContext();
        String realPath = context.getRealPath("/downloadSrc/11.jpg");
        FileInputStream fis = new FileInputStream(realPath);

        byte[] tmp = new byte[fis.available()];
        fis.read(tmp);
        fis.close();

        //2.将要下载的文件返回
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Disposition","attachment;filename="+"11.jpg");
        return new ResponseEntity<byte[]>(tmp,headers, HttpStatus.OK);
    }

}
