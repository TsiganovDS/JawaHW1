public class Z8 {
    public static void main(String[] args) {
        var HoursWork = 640;
        var WorkOneEmployee = 8;
        var NumberofEmployees = HoursWork / WorkOneEmployee;
        System.out.println("Всего работников в компании - " + NumberofEmployees + ".");
        var NumberofEmployees1 = NumberofEmployees + 94;
        var ManHour = NumberofEmployees1 / WorkOneEmployee;
        System.out.println("Если в компании работает " + NumberofEmployees1 + " человек, то всего " + ManHour + " часов работы может быть поделено между сотрудниками.");
    }
}