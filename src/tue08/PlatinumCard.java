package tue08;

public class PlatinumCard extends MemberCard {
    // annotation
    @Override
    public float discount(float amount) {
        return amount * .05f;
    }
}
