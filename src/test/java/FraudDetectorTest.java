import com.prapor.primary.FraudDetector;
import com.prapor.primary.Trader;
import com.prapor.primary.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest {

    private FraudDetector fraudDetector = new FraudDetector();






    @Test
    public void shouldByFraudDetectorRule_1(){
        Trader trader = new Trader("Pokemon", "Paris", "France");
        Transaction transaction = new Transaction(trader, 1_000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorRule_1_false() {
        Trader trader = new Trader("John", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorRule_2(){
        Trader trader = new Trader("Enny", "Paris", "France");
        Transaction transaction = new Transaction(trader, 1_000_001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorRule_2_false() {
        Trader trader = new Trader("John", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorRule_3(){
        Trader trader = new Trader("Endy", "Sydney", "France");
        Transaction transaction = new Transaction(trader, 1_000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorRule_3_false() {
        Trader trader = new Trader("John", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 50_000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorRule_4(){
        Trader trader = new Trader("Vaska", "Paris", "Jamaica");
        Transaction transaction = new Transaction(trader, 100_000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorRule_4_false() {
        Trader trader = new Trader("John", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 0);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorRule_5(){
        Trader trader = new Trader("Pokemon", "Paris", "Germany");
        Transaction transaction = new Transaction(trader, 1_001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorRule_5_false() {
        Trader trader = new Trader("John", "Rome", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}
