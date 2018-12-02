package com.hellcat.o2o.util;

public class PathUtil {
    //获取系统名   本次测试机型是Window 7
    static String os = System.getProperty("os.name");
    static String systemWindowsName = "window";
    /**
     * 返回系统的根路径
     * @return
     */
    public static String getImaBasePath(){
        String basePath;
        /**
         * 如果是windows系统，则根目录为F:\image
         * 如果是mac或者是linux操作系统，则目录为/home/image
         */
        if(os.toLowerCase().startsWith(systemWindowsName)){
            basePath="F:\\image";
        }else{
            basePath = "/home/image";
        }
        return basePath;
    }

    /**
     * 获取商家图片的路径
     * @param shopId
     * @return
     */
    public static String getShopImagePath(long shopId){
        String imagePath;
        //如果是windows系统
        if(os.toLowerCase().startsWith(systemWindowsName)){
            imagePath = "upload\\item\\shop"+shopId+"\\";
        }else{
            imagePath = "upload/item/shop"+shopId+"/";
        }
        return imagePath;
    }
}
