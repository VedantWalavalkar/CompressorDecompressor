package AccioProjects.CompressorDecompressor.comp_decomp;
import java.io.*;
import java.util.zip.GZIPInputStream;

public class decompressor {
    public static void method(File file) throws IOException{
        String fileDirectory = file.getParent();

        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"/decompressed.gz");

        byte[] buffer = new byte[1024];
        int len;

        while((len = fis.read()) != -1){
            fos.write(buffer,0,len);
        }

        fos.close();
        fis.close();
        gzip.close();
    }
//    public static void main(String[] args) throws IOException {
//        File path = new File("C:\\Users\\dell\\Documents\\AccioProjects\\Compressor\\compressordecompressor\\compressedFile.gz");
//        method(path);
//    }
}
