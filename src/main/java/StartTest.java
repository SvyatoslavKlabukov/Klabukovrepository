import java.util.*;

public class StartTest {
    private static Map<String, List<String>> contacts = new HashMap<String, List<String>>();

    static  {
        contacts.put("Сидоров С.С.", Arrays.asList("+8 800 2000 800","+8 800 1000 900", "+8 800 1234 657 111"));
        contacts.put("Петров А.С.", Arrays.asList("+7 456 2000 765","+5 800 1000 900"));
        contacts.put("Иванов В.П.", Arrays.asList("+9 322 7000 432","+4 324 324"));
        contacts.put("Михайлов Р.К.", Arrays.asList("+5 899 3000 323","+2 233 4354 000"));
    }

    public static void main(String[] args) {
        System.out.println("Введите фамилию");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        List <String> phones = contacts.get(s);

        if (phones != null) {
            int i = 1;
            for (String phone : phones) {
                System.out.println(i + ". " + phone);
                i++;
            }
        }else {
            System.out.println("ФИО в БД нет");
        }

    }
}
