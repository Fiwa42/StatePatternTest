public class InfectionPhase extends AbstractPhase implements TurnPhase {
   public InfectionPhase(GameContext context, Player player) {
      super(context, player);
   }

   public void operate() {
      System.out.println("Infection Phase for player " + this.player.getName());
      this.context.endTurn();
      this.context.setPhase(this.context.getActionPhase());
   }
}
