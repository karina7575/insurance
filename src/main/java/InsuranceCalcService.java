import java.math.BigDecimal;

public interface InsuranceCalcService {

    public BigDecimal insuranceCost(BigDecimal coverageAmount, TypeOfInsurance typeOfInsurance);
}
