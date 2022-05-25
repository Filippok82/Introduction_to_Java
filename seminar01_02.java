//На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раза, а умножается на c
// - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 

public class seminar01_02 {
  
  public static void main(String[] args) {
    generate(1, 7, 1, 3, "");
    generate(2, 7, 1, 2, "");



  }
  
    public static void generate(int source, int target, int c, int d, String path) {
      if (source > target)
      return;
      if (source == target) {
      System.out.println(path);
      return;
        
    }
      generate(source + c, target, c, d, path + "k1");
      generate(source * d, target, c, d, path + "k2");
    
  }

}

