public class Demo {
   private String name;
   private int age;

   public String getName(){
    return name;
   }

   public void setName(String newName){
    name = newName;
   }

   public int getAge(){
    return age;
   }

   public void setAge(int newAge){
    if(newAge > 30){
        System.out.println("Umur maksimal hanya 30");
    } if (newAge < 18) {
        System.out.println("Umur Minimal hanya 18");
    } else {
        age = newAge;
    }
   }
}
