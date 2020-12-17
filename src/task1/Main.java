package task1;

public class Main {
    public static void main(String[] args) {
        class Person{
            StringBuilder name = new StringBuilder();
            StringBuilder surname = new StringBuilder();
            StringBuilder middleName = new StringBuilder();

            public void SetNames(StringBuilder firstName, StringBuilder secondName, StringBuilder thirdName){
                name = firstName;
                surname = secondName;
                middleName = thirdName;
            }

            public String getNames(){
                return toString();
            }

            @Override
            public String toString() {
                return name+"."+surname.charAt(0)+"."+middleName.charAt(0)+".";
            }
        }
    }
}
