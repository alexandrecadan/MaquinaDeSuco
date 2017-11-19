import maquinadesuco.CopoSuco;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CopoSucoTest {
    
    @Test
    public void testeCopoSucoTeste(){
        CopoSuco copoSuco = new CopoSuco();
        
        copoSuco.dosarIngrediente(CopoSuco.ACUCAR, 20);
        assertEquals(20, copoSuco.getAcucarAtual());
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
