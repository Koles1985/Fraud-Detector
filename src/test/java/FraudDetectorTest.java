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
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldByFraudDetectorAnyTrader(){
        Trader trader = new Trader("Jet", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}
