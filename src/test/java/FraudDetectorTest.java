import com.prapor.primary.FraudDetector;
import com.prapor.primary.Trader;
import com.prapor.primary.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest {

    private FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void shouldByFraudDetectorTraderPokemon(){
        Trader trader = new Trader("Pokemon", "Paris");
        Transaction transaction = new Transaction(trader, 1_000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorAnyTrader(){
        Trader trader = new Trader("Jet", "Rome");
        Transaction transaction = new Transaction(trader, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorTraderAmountMillionPlus(){
        Trader trader = new Trader("John", "Paris");
        Transaction transaction = new Transaction(trader, 1_000_001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorAmountMillionMinus(){
        Trader trader = new Trader("John", "Rome");
        Transaction transaction = new Transaction(trader, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }
    @Test
    public void shouldByFraudDetectorFromCityTrue(){
        Trader trader = new Trader("John", "Paris");
        Transaction transaction = new Transaction(trader, 1_000_001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorFromCityFalse(){
        Trader trader = new Trader("John", "Rome");
        Transaction transaction = new Transaction(trader, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorTraderFromJamaica(){
        Trader trader = new Trader("John", "Paris", "Jamaica");
        Transaction transaction = new Transaction(trader, 1_000_001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorTraderNotFromJamaica(){
        Trader trader = new Trader("John", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}
