import java.io.*;

class FileCount {
    public static void main(String[] args) throws Exception {
        File f = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(f));

        int lines=0, words=0, chars=0;
        String line;

        while((line=br.readLine())!=null) {
            lines++;
            words += line.split(" ").length;
            chars += line.length();
        }

        System.out.println(lines+" "+words+" "+chars);
    }
}