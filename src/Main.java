public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    String firstName = "Сёмен";
    String middleName = "Семёнович";
    String lastName = "Иванов";
    String fullName = lastName+' '+firstName+' '+middleName;
        System.out.println("Ф.И.О. сотрудника - "+fullName);

        System.out.println("Данные Ф.И.О. сотрудника для отчета - "+fullName.toUpperCase());
    String fullName2=fullName.replace('ё','e');
        System.out.println("Данные Ф.И.О. сотрудника - "+fullName2);

    }
}