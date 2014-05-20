package zombietutorial;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoObserver extends BaseObserver{

	/**
	 * Makes a number of randomly oriented zombies and then executes a set of commands on the
	 * created zombies.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created zombies
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> createZombies(int number, Closure closure) {
		AgentSet<zombietutorial.relogo.Zombie> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"Zombie");
		for (Turtle t : createResult){
			if (t instanceof zombietutorial.relogo.Zombie){
				result.add((zombietutorial.relogo.Zombie)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented zombies and then executes a set of commands on the
	 * created zombies.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created zombies
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> createZombies(int number) {
		return createZombies(number,null);
	}

	/**
	 * Makes a number of uniformly fanned zombies and then executes a set of commands on the
	 * created zombies.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created zombies
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> createOrderedZombies(int number, Closure closure) {
		AgentSet<zombietutorial.relogo.Zombie> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"Zombie");
		for (Turtle t : createResult){
			if (t instanceof zombietutorial.relogo.Zombie){
				result.add((zombietutorial.relogo.Zombie)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned zombies and then executes a set of commands on the
	 * created zombies.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created zombies
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> createOrderedZombies(int number) {
		return createOrderedZombies(number,null);
	}

	/**
	 * Queries if object is a zombie.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a zombie
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public boolean isZombieQ(Object o){
		return (o instanceof zombietutorial.relogo.Zombie);
	}

	/**
	 * Returns an agentset containing all zombies.
	 * 
	 * @return agentset of all zombies
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> zombies(){
		AgentSet<zombietutorial.relogo.Zombie> a = new AgentSet<zombietutorial.relogo.Zombie>();
		for (Object e : this.getContext().getObjects(zombietutorial.relogo.Zombie.class)) {
			if (e instanceof zombietutorial.relogo.Zombie){
				a.add((zombietutorial.relogo.Zombie)e);
			}
		}
		return a;
	}

	/**
	 * Returns the zombie with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public zombietutorial.relogo.Zombie zombie(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof zombietutorial.relogo.Zombie)
			return (zombietutorial.relogo.Zombie) turtle;
		return null;
	}

	/**
	 * Returns an agentset of zombies on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of zombies on patch p
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> zombiesOn(Patch p){
		AgentSet<zombietutorial.relogo.Zombie> result = new AgentSet<zombietutorial.relogo.Zombie>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"zombie")){
			if (t instanceof zombietutorial.relogo.Zombie)
			result.add((zombietutorial.relogo.Zombie)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of zombies on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of zombies on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> zombiesOn(Turtle t){
		AgentSet<zombietutorial.relogo.Zombie> result = new AgentSet<zombietutorial.relogo.Zombie>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"zombie")){
			if (tt instanceof zombietutorial.relogo.Zombie)
			result.add((zombietutorial.relogo.Zombie)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of zombies on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of zombies on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> zombiesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<zombietutorial.relogo.Zombie>();
		}

		Set<zombietutorial.relogo.Zombie> total = new HashSet<zombietutorial.relogo.Zombie>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(zombiesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(zombiesOn(p));
				}
			}
		}
		return new AgentSet<zombietutorial.relogo.Zombie>(total);
	}

	/**
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> createUserTurtles(int number, Closure closure) {
		AgentSet<zombietutorial.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof zombietutorial.relogo.UserTurtle){
				result.add((zombietutorial.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> createUserTurtles(int number) {
		return createUserTurtles(number,null);
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> createOrderedUserTurtles(int number, Closure closure) {
		AgentSet<zombietutorial.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof zombietutorial.relogo.UserTurtle){
				result.add((zombietutorial.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> createOrderedUserTurtles(int number) {
		return createOrderedUserTurtles(number,null);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof zombietutorial.relogo.UserTurtle);
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> userTurtles(){
		AgentSet<zombietutorial.relogo.UserTurtle> a = new AgentSet<zombietutorial.relogo.UserTurtle>();
		for (Object e : this.getContext().getObjects(zombietutorial.relogo.UserTurtle.class)) {
			if (e instanceof zombietutorial.relogo.UserTurtle){
				a.add((zombietutorial.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public zombietutorial.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof zombietutorial.relogo.UserTurtle)
			return (zombietutorial.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<zombietutorial.relogo.UserTurtle> result = new AgentSet<zombietutorial.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"userTurtle")){
			if (t instanceof zombietutorial.relogo.UserTurtle)
			result.add((zombietutorial.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<zombietutorial.relogo.UserTurtle> result = new AgentSet<zombietutorial.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"userTurtle")){
			if (tt instanceof zombietutorial.relogo.UserTurtle)
			result.add((zombietutorial.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<zombietutorial.relogo.UserTurtle>();
		}

		Set<zombietutorial.relogo.UserTurtle> total = new HashSet<zombietutorial.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<zombietutorial.relogo.UserTurtle>(total);
	}

	/**
	 * Makes a number of randomly oriented humans and then executes a set of commands on the
	 * created humans.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created humans
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> createHumans(int number, Closure closure) {
		AgentSet<zombietutorial.relogo.Human> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"Human");
		for (Turtle t : createResult){
			if (t instanceof zombietutorial.relogo.Human){
				result.add((zombietutorial.relogo.Human)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented humans and then executes a set of commands on the
	 * created humans.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created humans
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> createHumans(int number) {
		return createHumans(number,null);
	}

	/**
	 * Makes a number of uniformly fanned humans and then executes a set of commands on the
	 * created humans.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created humans
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> createOrderedHumans(int number, Closure closure) {
		AgentSet<zombietutorial.relogo.Human> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"Human");
		for (Turtle t : createResult){
			if (t instanceof zombietutorial.relogo.Human){
				result.add((zombietutorial.relogo.Human)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned humans and then executes a set of commands on the
	 * created humans.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created humans
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> createOrderedHumans(int number) {
		return createOrderedHumans(number,null);
	}

	/**
	 * Queries if object is a human.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a human
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public boolean isHumanQ(Object o){
		return (o instanceof zombietutorial.relogo.Human);
	}

	/**
	 * Returns an agentset containing all humans.
	 * 
	 * @return agentset of all humans
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> humans(){
		AgentSet<zombietutorial.relogo.Human> a = new AgentSet<zombietutorial.relogo.Human>();
		for (Object e : this.getContext().getObjects(zombietutorial.relogo.Human.class)) {
			if (e instanceof zombietutorial.relogo.Human){
				a.add((zombietutorial.relogo.Human)e);
			}
		}
		return a;
	}

	/**
	 * Returns the human with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public zombietutorial.relogo.Human human(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof zombietutorial.relogo.Human)
			return (zombietutorial.relogo.Human) turtle;
		return null;
	}

	/**
	 * Returns an agentset of humans on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of humans on patch p
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> humansOn(Patch p){
		AgentSet<zombietutorial.relogo.Human> result = new AgentSet<zombietutorial.relogo.Human>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"human")){
			if (t instanceof zombietutorial.relogo.Human)
			result.add((zombietutorial.relogo.Human)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of humans on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of humans on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> humansOn(Turtle t){
		AgentSet<zombietutorial.relogo.Human> result = new AgentSet<zombietutorial.relogo.Human>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"human")){
			if (tt instanceof zombietutorial.relogo.Human)
			result.add((zombietutorial.relogo.Human)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of humans on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of humans on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> humansOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<zombietutorial.relogo.Human>();
		}

		Set<zombietutorial.relogo.Human> total = new HashSet<zombietutorial.relogo.Human>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(humansOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(humansOn(p));
				}
			}
		}
		return new AgentSet<zombietutorial.relogo.Human>(total);
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof zombietutorial.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet<zombietutorial.relogo.UserLink> userLinks(){
		AgentSet<zombietutorial.relogo.UserLink> a = new AgentSet<zombietutorial.relogo.UserLink>();
		for (Object e : this.getContext().getObjects(zombietutorial.relogo.UserLink.class)) {
			if (e instanceof zombietutorial.relogo.UserLink){
				a.add((zombietutorial.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public zombietutorial.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (zombietutorial.relogo.UserLink)(this.getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public zombietutorial.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numHumans.
	 *
	 * @return the value of the global variable numHumans
	 */
	@ReLogoBuilderGeneratedFor("global: numHumans")
	public Object getNumHumans(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numHumans");
	}

	/**
	 * Sets the value of the global variable numHumans.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numHumans")
	public void setNumHumans(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numHumans",value);
	}

	/**
	 * Returns the value of the global variable numZombies.
	 *
	 * @return the value of the global variable numZombies
	 */
	@ReLogoBuilderGeneratedFor("global: numZombies")
	public Object getNumZombies(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numZombies");
	}

	/**
	 * Sets the value of the global variable numZombies.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numZombies")
	public void setNumZombies(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numZombies",value);
	}


}