package MainTest;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        String seperator = System.getProperty("file.separator");
        System.out.println(seperator);
        File file = new File("F:\\店铺项目\\SSM-Store\\src\\main\\resources\\rob.jpg");
        System.out.println(file.getName());
        System.out.println(file.getName().split("\\.")[1]);
        //System.out.println(file.getAbsoluteFile().toString().split("\\\"));
//        if(!file.exists()){
//            file.mkdirs();
//        }
    }
}
