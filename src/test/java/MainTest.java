import com.hanky.study.lombok.BindCardInfo;

public class MainTest {

    public static void main(String[] args) {
        BindCardInfo cardInfo = new BindCardInfo();
        cardInfo.setCardNo("767788");
        System.out.println(cardInfo.getCardNo());
    }
}
