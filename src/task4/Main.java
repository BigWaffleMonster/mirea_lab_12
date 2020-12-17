package task4;

public class Main {
    public static void main(String[] args) {
        class Phone{
            StringBuffer phoneNumber = new StringBuffer("+");
            Phone(String number) {
                char compar = number.charAt(0);
                int len = number.length();
                StringBuffer PhoneNum = new StringBuffer(number);
                StringBuffer code = new StringBuffer();
                PhoneNum.substring(len-10,len);
                String a = PhoneNum.substring(len-10,len-7);
                String b = PhoneNum.substring(len-7,len-4);
                String c = PhoneNum.substring(len-4,len);

                String t2 = PhoneNum.substring(0, 1);

                if(compar == '8')
                    code.append("+7");
                else {
                    String t3 = PhoneNum.substring(0, len - 10);
                    code.append(t3);
                }
                StringBuffer newNumber = new StringBuffer();
                newNumber.append(code);
                newNumber.append("-");
                newNumber.append(a);
                newNumber.append("-");
                newNumber.append(b);
                newNumber.append("-");
                newNumber.append(c);

                phoneNumber = newNumber;
            }


        }
        Phone a = new Phone("81234567890");
    }
}