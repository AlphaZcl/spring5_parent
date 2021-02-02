package top.zhuchl.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author zclys
 * @date 2021/2/1 11:26
 */
@Service
public class GetFileService {

    private static final Logger logger = LoggerFactory.getLogger(GetFileService.class);

    @Value("${fileUpLoad.parentPath}")
    private String parentPath;

    /**
     * 保存上传文件到本地
     * @param file
     */
    public void saveFile(MultipartFile file) throws IOException {
        File fileDir = new File(parentPath);
        if(!fileDir.exists()){
            fileDir.mkdirs();
        }
        String filename = file.getOriginalFilename();
        if(StringUtils.isEmpty(filename)){
            throw new IOException("文件保存失败，文件不存在");
        }
        File localFile = new File(parentPath+ File.separator + filename);
        if(!localFile.exists()){
            localFile.createNewFile();
        }
        file.transferTo(localFile);
    }

}
