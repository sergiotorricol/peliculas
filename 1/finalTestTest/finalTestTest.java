package finalTestTest;

import finalTest.FinalTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class finalTestTest {
    private int parameter;
    private String expectedResult;

    public finalTestTest(int parameter, String expectedResult) {
        this.parameter = parameter;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{-1, "FECHA INCORRECTA"});
        objects.add(new Object[]{0, "FECHA INCORRECTA"});
        objects.add(new Object[]{1, "EXISTE EVENTO - dia : 1"});
        objects.add(new Object[]{15, "EXISTE EVENTO - dia : 15"});
        objects.add(new Object[]{16, "NO HAY EVENTO - dia : 16"});
        objects.add(new Object[]{17, "EXISTE EVENTO - dia : 17"});
        objects.add(new Object[]{30, "NO HAY EVENTO - dia : 30"});
        objects.add(new Object[]{31, "EXISTE EVENTO - dia : 31"});
        objects.add(new Object[]{32, "FECHA INCORRECTA"});
        return objects;
    }

    @Test
    public void getEventosDiciembreTest() {
        String actualResult = FinalTest.getEventosDiciembre(this.parameter);
        Assert.assertEquals("ERROR", this.expectedResult, actualResult);

    }
}
