public class App {
  public static void main(String[] args) throws Exception {
    final Holiday[] holidayArray = new Holiday[11];

    holidayArray[0] = new Holiday("01/01/2023", "Confraternização mundial");
    holidayArray[1] = new Holiday("21/02/2023", "Carnaval");
    holidayArray[2] = new Holiday("17/04/2023", "Páscoa");
    holidayArray[3] = new Holiday("21/04/2023", "Tiradentes");
    holidayArray[4] = new Holiday("01/05/2023", "Dia do trabalho");
    holidayArray[5] = new Holiday("08/06/2023", "Corpus Christi");
    holidayArray[6] = new Holiday("07/09/2023", "Independência do Brasil");
    holidayArray[7] = new Holiday("12/10/2023", "Nossa Senhora Aparecida");
    holidayArray[8] = new Holiday("02/11/2023", "Finados");
    holidayArray[9] = new Holiday("15/11/2023", "Proclamação da República");
    holidayArray[10] = new Holiday("25/12/2023", "Natal");

    final HolidayList holidayList = new HolidayList(holidayArray);

    Holiday[] list = holidayList.getList();

    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i].getName());
    }

    System.out.println("--------------------------------------");

    System.out.println(holidayList.isHoliday("01/01/2023"));

    System.out.println(holidayList.isHoliday("02/01/2023"));
  }
}