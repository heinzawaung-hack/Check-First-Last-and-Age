public class Phone {
   private String firstName;
   private String lastName;
   private int age;

   public String getFirstName(){
      return firstName;
   }
   public String getLastName(){
      return lastName;
   }
   public int getAge(){
      return age;
   }
   public void setFirstName(String newFirstName){
      this.firstName = newFirstName;
   }
   public void setLastName(String newLastName){
      this.lastName = newLastName;
   }
   public void setAge(int newAge){
      if ((newAge < 0) || (newAge > 100)){
         this.age = 0;
      }else {
         this.age = newAge;
      }
   }

   public String getFullName(){
      if ((firstName.isEmpty()) && (lastName.isEmpty())){
         return "";
      }else if (firstName.isEmpty()){
         return lastName;
      }else if (lastName.isEmpty()){
         return firstName;
      }return firstName + lastName;
   }

   public boolean teen(){
      return (age > 12) && (age < 20);
   }
}
