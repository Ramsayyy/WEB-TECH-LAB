class stcls {
    private static String name = "Saka";
    private static int age=20;

    public static void disp() {
         System.out.println("Name is:"+name);
         System.out.println("Age is:"+age);
      }

   public static void main(String args[]) {
      System.out.println("Static members and methods Example:");
      System.out.println("Calling static method:");
      disp();
      name="emile";
      age=21;
      System.out.println("Calling static method:");
     disp();
   }
}