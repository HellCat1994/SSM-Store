package com.hellcat.o2o.util;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author whg
 */
public class ImageUtil {
    /**
     * 获取年月日的格式
     */
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();
    public static String generateThumbnail(CommonsMultipartFile commonsMultipartFile,String targetAddr){
        //生成随机文件名
        String realFileName = getRandomFileName();
        //获取文件的扩展名
        String extension = getFileExtension(new File(""));
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(PathUtil.getImaBasePath()+relativeAddr);
        try{
            Thumbnails.of(commonsMultipartFile.getInputStream()).size(200,200)
                    .outputQuality(0.8f)
                    .toFile(dest);
        }catch (IOException e){
            e.printStackTrace();
        }
        return relativeAddr;
    }

    /**
     * 创建目标路径所涉及的目录，即/home/work/whg/xxx.jpg
     * 则home work whg文件夹需要自动创建出来
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImaBasePath()+targetAddr;
        File dirPath = new File(realFileParentPath);
        if(!dirPath.exists()){
            dirPath.mkdirs();
        }
    }

    /**
     * 获取输入文件流的扩展名
     * @param file
     * @return
     */
    private static String getFileExtension(File file) {
        String extensionFile = file.getName().split("\\.")[1];
        return "."+ extensionFile;
    }

    /**
     * 生成随机文件名，当前年月日时分秒+5位随机数
     * @return
     */
    private static String getRandomFileName(){
        //获取随机的五位数
        int randNum = r.nextInt(89999)+10000;
        String nowTimeStr = sDateFormat.format(new Date());
        return nowTimeStr + randNum;
    }

    public static void main(String[] args) throws IOException {
        String basePath = "D:\\店铺项目\\SSM-Store\\src\\main\\resources\\";
        System.out.println(basePath);
        Thumbnails.of(new File("F:\\rob.jpg"))
                .size(200,200).watermark(Positions.BOTTOM_RIGHT,
                ImageIO.read(new File(basePath+"mouse.jpg")),0.25f).outputQuality(0.8f)
                .toFile("F:\\rob1.jpg");
    }
}
