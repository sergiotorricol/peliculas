package finalTest;

public class FinalTest {
    public static String getEventosDiciembre(int day) {
        String msg;
        if (day > 0 && day <= 31) {
            if (day % 2 == 0) {
                msg = "NO HAY EVENTO - dia : " + day;
            } else {
                msg = "EXISTE EVENTO - dia : " + day;
            }
        } else {
            msg = "FECHA INCORRECTA";
        }
        return msg;
    }
}
