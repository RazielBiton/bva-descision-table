package bva_desciisionTable.bva_desciisionTable;

import org.junit.jupiter.api.Test;

public class CoinDecisionTest {
    @Test
    public void R_1_2_3_16() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "H", "T", "T");
        assert(result.equals("Positive"));
    }

    @Test
    public void R_4() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "T", "T", "T");
        assert(result.equals("Negative"));
    }

    @Test
    public void R_5_6() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "T", "T", "H");
        assert(result.equals("Negative"));
    }

    @Test
    public void R_7_8_14() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "H", "T", "T");
        assert(result.equals("Positive"));
    }

    @Test
    public void R_9() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "T", "T", "H");
        assert(result.equals("Positive"));
    }

    @Test
    public void R_10() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "H", "H", "T");
        assert(result.equals("Positive"));
    }

    @Test
    public void R_11() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "T", "H", "T");
        assert(result.equals("Positive"));
    }

    @Test
    public void R_12() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "H", "T", "H");
        assert(result.equals("Positive"));
    }

    @Test
    public void R_13() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "H", "T", "T");
        assert(result.equals("Negative"));
    }
    @Test
    public void R_15() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "T", "H", "T");
        assert(result.equals("Negative"));
    }

}
