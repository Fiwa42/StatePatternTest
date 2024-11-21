public class ActionPhase extends AbstractPhase implements TurnPhase {
   public ActionPhase(GameContext context, Player player) {
      super(context, player);
   }

   public void operate() {
      System.out.println("ActionPhase for player " + this.player.getName());
      this.context.setPhase(this.context.getDrawPhase());
   }
}
