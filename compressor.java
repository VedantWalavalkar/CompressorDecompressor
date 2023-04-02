package AccioProjects.CompressorDecompressor.comp_decomp;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class compressor {
    public static void method(File file) throws IOException{
        String fileDirectory = file.getParent();

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"/compressedFile.gz");
        GZIPOutputStream gzip = new GZIPOutputStream(fos);

        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer)) != -1){
            gzip.write(buffer,0,len);
        }
        fis.close();
        fos.close();
        gzip.close();
    }

    public static void main(String[] args) throws IOException {
//        File path = new File("C:\\Users\\dell\\Documents\\AccioProjects\\Compressor\\compressordecompressor\\compressedFile.gz");
//        method(path);
//        method(path);
    }
}
