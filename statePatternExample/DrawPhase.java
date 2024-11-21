public class DrawPhase extends AbstractPhase implements TurnPhase {
   public DrawPhase(GameContext context, Player player) {
      super(context, player);
   }

   public void operate() {
      System.out.println("Draw Phase for player " + this.player.getName());
      this.context.setPhase(this.context.getInfectionPhase());
   }
}
