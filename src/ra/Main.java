package ra;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) throws IOException {
        // File đại diện cho 1 tệp, thư mục trong hệ điều hành của hệ thống
        File data = new File("data");
        // kiểm tra tồn tại
        System.out.println(data.exists());
        if (!data.exists()){
            // tạo mới file
//            data.createNewFile();
            // tạo thư mục
            data.mkdir();
        }


        System.out.println(data.canRead() +" - "+ data.canWrite()); // kiểm tra quyền đọc ghi
        System.out.println(data.isDirectory());
        System.out.println(data.length());

//        File[] children = data.listFiles();
//        System.out.println();
//        boolean check =  data.delete();
//        System.out.println(check);
//        Serializable là cơ chế cho phép 1 đối tượng có thể lưu trữ được dưới dạng nhị phan


    }
}
