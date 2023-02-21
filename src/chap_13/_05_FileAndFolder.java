package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        //String folder = "D:\\Study\\Inflearn\\Java\\JavaWorkspace\\src\\chap_13";
        String folder = "src/chap_13";
        File filesAndFolders = new File(folder);
        System.out.println(filesAndFolders.getAbsolutePath());

        for (File file : filesAndFolders.listFiles()) {
            if(file.isFile()){
                System.out.println("(파일)" + file.getName());
            }else if(file.isDirectory()){
                System.out.println("(폴더)" + file.getName());
            }
        }
    }
}
