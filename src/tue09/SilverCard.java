package tue09;

public class SilverCard extends MemberCard {
    @Override
    public float discount(float amount) {
        if (amount > 2000f) {
            return amount * .03f;
        } else {
            return 0f;
        }
    }

    @Override
    public float rewardXPoint() {
        return 1f;
    }
}
