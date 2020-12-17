package task2;

public class Main {
    public static void main(String[] args) {
        class Address{
            String country;
            String region;
            String town;
            String street;
            String house;
            String housing;
            String flat;

            public void SetAddress(StringBuffer stringAddress){
                String border = "";
                if(stringAddress.indexOf(",") != -1){
                    border = ",";
                }
                else if(stringAddress.indexOf(".") != -1){
                    border = ".";
                }
                else if(stringAddress.indexOf(";") != -1){
                    border = ";";
                }
                else if(stringAddress.indexOf("-") != -1){
                    border = "-";
                }

                    //Присваивание страны
                int start = 0;
                int borderIndex = stringAddress.indexOf(border);
                country = stringAddress.substring(start, borderIndex);

                //Присваивание региона
                start = borderIndex+2;
                borderIndex = stringAddress.indexOf(border, start);
                region = stringAddress.substring(start, borderIndex);

                //Присваивание города
                start = borderIndex+2;
                borderIndex = stringAddress.indexOf(border, start);
                town = stringAddress.substring(start, borderIndex);

                //Присваивание улицы
                start = borderIndex+2;
                borderIndex = stringAddress.indexOf(border, start);
                street = stringAddress.substring(start, borderIndex);

                //Присваивание дома
                start = borderIndex+2;
                borderIndex = stringAddress.indexOf(border, start);
                house = stringAddress.substring(start, borderIndex);

                //Присваивание корпуса
                start = borderIndex+2;
                borderIndex = stringAddress.indexOf(border, start);
                housing = stringAddress.substring(start, borderIndex);

                //Присваивание квартиры
                start = borderIndex+2;
                borderIndex = stringAddress.indexOf(border, start);
                flat = stringAddress.substring(start, borderIndex);
            }
        }
    }
}
