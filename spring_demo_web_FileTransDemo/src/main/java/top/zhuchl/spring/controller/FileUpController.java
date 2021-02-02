package top.zhuchl.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import top.zhuchl.spring.service.GetFileService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zclys
 * @date 2021/2/1 9:09
 */
@Controller
@RequestMapping("web/file")
public class FileUpController {

    private static final Logger logger = LoggerFactory.getLogger(FileUpController.class);

    @Autowired
    private GetFileService fileService;

    @ModelAttribute
    public void globalFunBefore(ModelAndView mv) {
        logger.info("-----global_before，前置处理------");
        Map<String, Object> resMap = new HashMap<>();
        Map<String, Object> head = new HashMap<>();
        head.put("jnl", "123456789");
        head.put("SvrCod", "000001");
        head.put("MsgID", "123456789");
        resMap.put("head", head);
        Map<String, Object> body = new HashMap<>();
        resMap.put("body", body);
        mv.addAllObjects(resMap);
    }

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


}
