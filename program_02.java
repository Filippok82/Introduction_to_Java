
// Строки

// public class program_02 {
//     public static void main(String[] args) {
//     //  version01(args);
//     //  version02(args);
//     }

//     public static void version01(String[] args) { // String
//         String str = "";
//         for (int i = 0; i < 1000; i++) {
//             str += "+";
//         }
//         System.out.println(str);
//     }

//     public static void version02(String[] args) { // StringBuilder
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < 1000; i++) {
//         sb.append("+");

//         System.out.println(sb);
//     }
// }
// }
//_____________________________________________________________
// Время выполнения String / StringBuilder
// public class program_02 {
//     public static void main(String[] args) {
//         var s = System.currentTimeMillis();
//         String str = "";
//         // StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < 9000; i++) {
//             str += "+";
//             // sb.append("+");
//         }
//         System.out.println(System.currentTimeMillis() - s);
//         // System.out.println(str);
//         //System.out.println(sb);
//     }
//  }
//__________________Функционал строк_______________________________________

//  public class program_02 {
//     public static void main(String[] args) {
//       String[] name = { "C", "е", "р", "г", "е", "й" };
//       String sk = "СЕРГЕЙ КА.";
//       System.out.println(sk.toLowerCase()); // сергей ка.
//       System.out.println(String.join("", name)); // Cергей
//       System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));// C,е,р,г,е,й
//       System.out.println(sk.charAt(1));//Е
//       System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
//      }
//   }
// ___________________Работа с файловой системой_________________________________

// import java.io.File;
// public class program_02 {
//     public static void main(String[] args) {
//         String pathProject = System.getProperty("user.dir");
//         String pathFile = pathProject.concat("/file.txt");
//         File f3 = new File(pathFile);
//         System.out.println(f3.getAbsolutePath());

//         System.out.println(pathFile);
//         File f1 = new File("file.txt");
//         File f2 = new File("/C/Java/java_projects/file.txt");
//         System.out.println(f1.getAbsolutePath());
//         System.out.println(f2.getAbsolutePath());
//     }
// }

//________________________TRY CATCH FINALLY______________________________________-

// import java.io.File;
// public class program_02 {
//    public static void main(String[] args) {
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File f3 = new File(pathFile);
//            System.out.println("try");
//        } catch (Exception e) {
//            System.out.println("catch");
//        }
//        finally
//        { System.out.println("finally"); }
//    }
// }
//__________________Еше пример_______________________________________

// import java.io.File;
// public class program_02 {
//    public static void main(String[] args) {
//            try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File file = new File(pathFile);
//            if (file.createNewFile()) {
//                System.out.println("file.created");
//            }
//            else {
//                System.out.println("file.existed");
//            }
//        } catch (Exception e) {
//         System.out.println("catch");
//        } finally {
//     System.out.println("finally");
// }
// }
// }

// __________________________Работа с каталогами________________________

// import java.io.File;
// public class program_02 {
//    public static void main(String[] args) {
//        String pathProject = System.getProperty("user.dir");
//        String pathDir = pathProject.concat("/files");
//        File dir = new File(pathDir);
//        System.out.println(dir.getAbsolutePath());
//        if (dir.mkdir()) {
//            System.out.println("+");
//        } else {
//            System.out.println("-");
//        }
//        for (String fname : dir.list()) {
//            System.out.println(fname);
//        } 
//     }
// } 
// __________________________Работа с бинарными файлами_____________________________




// import java.io.*;
// import java.nio.ByteBuffer;
// import java.nio.ByteOrder;
// import java.nio.charset.Charset;
// import java.nio.charset.StandardCharsets;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Map.Entry;

// public class program_02 {

//     static ByteOrder bOrder = ByteOrder.LITTLE_ENDIAN;
//     static Map<String, String> data = new HashMap<>();
//     static Charset charset = StandardCharsets.UTF_8;

//     static void loadFile(String path) throws IOException {
//         try (InputStream stream = 
//         new BufferedInputStream(new FileInputStream(path))) {
//             int n = readInt(stream);
//             int b1;
//             int b2;
//             byte binWord[];
//             byte binText[];
//             for (int i = 0; i < n; i++) {
//                 binWord = new byte[readInt(stream)];
//                 binText = new byte[readInt(stream)];
//                 b1 = stream.read(binWord);
//                 b2 = stream.read(binText);
//                 if (b1 != binWord.length || b2 != binText.length)
//                     throw new IOException("Error read file");
//                 data.put(new String(binWord, charset), 
//                          new String(binText, charset));
//             }
//         }
//     }

//     static void saveFile(String path) throws IOException {
//         if (data.size() == 0)
//             throw new IOException("Nothing to write");
//         try (OutputStream stream = new BufferedOutputStream(new FileOutputStream(path, false))) {
//             writeInt(stream, data.size());
//             byte binWord[];
//             byte binText[];
//             for (Entry<String, String> entry : data.entrySet()) {
//                 binWord = entry.getKey().getBytes(charset);
//                 writeInt(stream, binWord.length);
//                 binText = entry.getValue().getBytes(charset);
//                 writeInt(stream, binText.length);
//                 stream.write(binWord);
//                 stream.write(binText);
//             }
//         }
//     }

//     static void delete(String word) {
//         data.remove(word);
//     }

//     static void add(String word, String text) throws Exception {
//         if (data.get(word) != null)
//             throw new Exception("Word already exist");
//         data.put(word, text);
//     }

//     static String find(String word) {
//         String out = data.get(word);
//         if (out == null)
//             return "не найдено";
//         else
//             return out;
//     }

//     static int readInt(InputStream in) throws IOException {
//         byte out[] = new byte[4];
//         int i = in.read(out);
//         if (i != 4)
//             throw new IOException("Error read file");
//         return ByteBuffer.wrap(out).order(bOrder).getInt();
//     }

//     static void writeInt(OutputStream out, int num) throws IOException {
//         ByteBuffer dbuf = ByteBuffer.allocate(4);
//         dbuf.order(bOrder).putInt(num);
//         out.write(dbuf.array());
//     }

//     public static void main(String[] args) {
//         String file = "test.bin";
//         //create file
        
//         try {
//             add("key1", "значение 1");
//             add("key2", "значение 2");
//             add("key4", "значение 3");
//             saveFile(file);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         //read file
        
//         try {
//             loadFile(file);
//             String key1 = "key1";
//             String key2 = "key2";
//             String key3 = "key3";
//             System.out.printf("%s: %s\n", key1, find(key1));
//             System.out.printf("%s: %s\n", key2, find(key2));
//             System.out.printf("%s: %s\n", key3, find(key3));
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }


// ____________________________Логирование____________________________

import java.io.IOException;
import java.util.logging.*;

public class program_02 {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(program_02.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //fh.setFormatter(sFormat);
        fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}



