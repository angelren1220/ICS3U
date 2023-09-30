class EvenAndOddNumbers {
  public static void main(String[] args){
    Odd();
    Even();
  }

  public static void Odd(){
    System.out.println("Odd numbers in 100");

    for(int i = 1; i <= 100; i++){
      if(i % 2 != 0){
        System.out.println(i);
      }
    }
  }

  public static void Even(){
    System.out.println("Even numbers in 100");

    for(int i = 1; i <= 100; i++){
      if(i % 2 == 0){
        System.out.println(i);
      }
    }
  }
}
