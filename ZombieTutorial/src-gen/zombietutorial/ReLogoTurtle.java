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
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoTurtle extends BaseTurtle{

	/**
	 * Makes a number of new zombies and then executes a set of commands on the
	 * created zombies.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created zombies
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> hatchZombies(int number, Closure closure) {
		AgentSet<zombietutorial.relogo.Zombie> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"Zombie");
		for (Turtle t : createResult){
			if (t instanceof zombietutorial.relogo.Zombie){
				result.add((zombietutorial.relogo.Zombie)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new zombies and then executes a set of commands on the
	 * created zombies.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created zombies
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> hatchZombies(int number) {
		return hatchZombies(number,null);
	}

	/**
	 * Returns an agentset of zombies from the patch of the caller.
	 * 
	 * @return agentset of zombies from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> zombiesHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<zombietutorial.relogo.Zombie> result = new AgentSet<zombietutorial.relogo.Zombie>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"zombie")){
			if (t instanceof zombietutorial.relogo.Zombie)
			result.add((zombietutorial.relogo.Zombie)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of zombies on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of zombies at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Zombie")
	public AgentSet<zombietutorial.relogo.Zombie> zombiesAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
		AgentSet<zombietutorial.relogo.Zombie> result = new AgentSet<zombietutorial.relogo.Zombie>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"zombie")){
			if (t instanceof zombietutorial.relogo.Zombie)
			result.add((zombietutorial.relogo.Zombie)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<zombietutorial.relogo.Zombie>();
		}
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
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"zombie")){
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
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"zombie")){
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
		for (Object e : this.getMyObserver().getContext().getObjects(zombietutorial.relogo.Zombie.class)) {
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
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof zombietutorial.relogo.Zombie)
			return (zombietutorial.relogo.Zombie) turtle;
		return null;
	}

	/**
	 * Makes a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> hatchUserTurtles(int number, Closure closure) {
		AgentSet<zombietutorial.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof zombietutorial.relogo.UserTurtle){
				result.add((zombietutorial.relogo.UserTurtle)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> hatchUserTurtles(int number) {
		return hatchUserTurtles(number,null);
	}

	/**
	 * Returns an agentset of userTurtles from the patch of the caller.
	 * 
	 * @return agentset of userTurtles from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> userTurtlesHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<zombietutorial.relogo.UserTurtle> result = new AgentSet<zombietutorial.relogo.UserTurtle>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof zombietutorial.relogo.UserTurtle)
			result.add((zombietutorial.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of userTurtles on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of userTurtles at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserTurtle")
	public AgentSet<zombietutorial.relogo.UserTurtle> userTurtlesAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
		AgentSet<zombietutorial.relogo.UserTurtle> result = new AgentSet<zombietutorial.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof zombietutorial.relogo.UserTurtle)
			result.add((zombietutorial.relogo.UserTurtle)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<zombietutorial.relogo.UserTurtle>();
		}
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
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"userTurtle")){
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
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"userTurtle")){
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
		for (Object e : this.getMyObserver().getContext().getObjects(zombietutorial.relogo.UserTurtle.class)) {
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
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof zombietutorial.relogo.UserTurtle)
			return (zombietutorial.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Makes a number of new humans and then executes a set of commands on the
	 * created humans.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created humans
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> hatchHumans(int number, Closure closure) {
		AgentSet<zombietutorial.relogo.Human> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"Human");
		for (Turtle t : createResult){
			if (t instanceof zombietutorial.relogo.Human){
				result.add((zombietutorial.relogo.Human)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new humans and then executes a set of commands on the
	 * created humans.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created humans
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> hatchHumans(int number) {
		return hatchHumans(number,null);
	}

	/**
	 * Returns an agentset of humans from the patch of the caller.
	 * 
	 * @return agentset of humans from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> humansHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<zombietutorial.relogo.Human> result = new AgentSet<zombietutorial.relogo.Human>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"human")){
			if (t instanceof zombietutorial.relogo.Human)
			result.add((zombietutorial.relogo.Human)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of humans on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of humans at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Human")
	public AgentSet<zombietutorial.relogo.Human> humansAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
		AgentSet<zombietutorial.relogo.Human> result = new AgentSet<zombietutorial.relogo.Human>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"human")){
			if (t instanceof zombietutorial.relogo.Human)
			result.add((zombietutorial.relogo.Human)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<zombietutorial.relogo.Human>();
		}
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
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"human")){
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
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"human")){
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
		for (Object e : this.getMyObserver().getContext().getObjects(zombietutorial.relogo.Human.class)) {
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
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof zombietutorial.relogo.Human)
			return (zombietutorial.relogo.Human) turtle;
		return null;
	}

	/**
	 * Makes a directed userLink from a turtle to the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public zombietutorial.relogo.UserLink createUserLinkFrom(Turtle t, Closure closure){
		zombietutorial.relogo.UserLink link = (zombietutorial.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public zombietutorial.relogo.UserLink createUserLinkFrom(Turtle t){
			return createUserLinkFrom(t,null);
	}

	/**
	 * Makes directed userLinks from a collection to the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet<zombietutorial.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a, Closure closure){
		AgentSet<zombietutorial.relogo.UserLink> links = new AgentSet<zombietutorial.relogo.UserLink>();
		for(Turtle t : a){
			links.add((zombietutorial.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this));
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks from a collection to the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet<zombietutorial.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a){
		return createUserLinksFrom(a,null);
	}

	/**
	 * Makes a directed userLink to a turtle from the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public zombietutorial.relogo.UserLink createUserLinkTo(Turtle t, Closure closure){
		zombietutorial.relogo.UserLink link = (zombietutorial.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,t);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public zombietutorial.relogo.UserLink createUserLinkTo(Turtle t){
			return createUserLinkTo(t,null);
	}

	/**
	 * Makes directed userLinks to a collection from the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet<zombietutorial.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a, Closure closure){
		AgentSet<zombietutorial.relogo.UserLink> links = new AgentSet<zombietutorial.relogo.UserLink>();
		for(Object t : a){
			if (t instanceof Turtle){
				links.add((zombietutorial.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,(Turtle)t));
			}
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks to a collection from the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet<zombietutorial.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a){
		return createUserLinksTo(a,null);
	}

	/**
	 * Queries if there is a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink from
	 *         turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public boolean inUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(t, this);
	}

	/**
	 * Returns the agentset with directed userLinks to the caller.
	 * 
	 * @return agentset with directed userLinks to the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet inUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getPredecessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink from turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public zombietutorial.relogo.UserLink inUserLinkFrom(Turtle t){
		return (zombietutorial.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(t,this);
	}

	/**
	 * Returns an agentset of directed userLinks from other turtles to the caller.
	 * 
	 * @return agentset of directed userLinks from other turtles to the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet<zombietutorial.relogo.UserLink> myInUserLinks(){
		AgentSet<zombietutorial.relogo.UserLink> result = new AgentSet<zombietutorial.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getInEdges(this)){
			if (o instanceof zombietutorial.relogo.UserLink){
				result.add((zombietutorial.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Returns an agentset of directed userLinks to other turtles from the caller.
	 * 
	 * @return agentset of directed userLinks to other turtles from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet<zombietutorial.relogo.UserLink> myOutUserLinks(){
		AgentSet<zombietutorial.relogo.UserLink> result = new AgentSet<zombietutorial.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getOutEdges(this)){
			if (o instanceof zombietutorial.relogo.UserLink){
				result.add((zombietutorial.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Queries if there is a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink to
	 *         turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public boolean outUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(this, t);
	}

	/**
	 * Returns the agentset with directed userLinks from the caller.
	 * 
	 * @return agentset with directed userLinks from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet outUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getSuccessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink to turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public zombietutorial.relogo.UserLink outUserLinkTo(Turtle t){
		return (zombietutorial.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(this, t);
	}

	/**
	 * Reports true if there is a userLink connecting t and the caller.
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public boolean userLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isAdjacent(this, t);
	}

	/**
	 * Returns the agentset of all turtles found at the other end of
	 * userLinks connected to the calling turtle.
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet userLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getAdjacent(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns an agentset of the caller's userLinks.
	 * 
	 * @return agentset of the caller's userLinks
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.UserLink")
	public AgentSet<zombietutorial.relogo.UserLink> myUserLinks(){
		AgentSet<zombietutorial.relogo.UserLink> result = new AgentSet<zombietutorial.relogo.UserLink>();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getEdges(this)){
			if (o instanceof zombietutorial.relogo.UserLink){
				result.add((zombietutorial.relogo.UserLink)o);
			}
		}
		return result;
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
		for (Object e : this.getMyObserver().getContext().getObjects(zombietutorial.relogo.UserLink.class)) {
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
		return (zombietutorial.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
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
	 * Makes a directed infection from a turtle to the caller then executes a set of
	 * commands on the created infection.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created infection
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public zombietutorial.relogo.Infection createInfectionFrom(Turtle t, Closure closure){
		zombietutorial.relogo.Infection link = (zombietutorial.relogo.Infection)this.getMyObserver().getNetwork("Infection").addEdge(t,this);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed infection from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created infection
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public zombietutorial.relogo.Infection createInfectionFrom(Turtle t){
			return createInfectionFrom(t,null);
	}

	/**
	 * Makes directed infections from a collection to the caller then executes a set
	 * of commands on the created infections.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created infections
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet<zombietutorial.relogo.Infection> createInfectionsFrom(Collection<? extends Turtle> a, Closure closure){
		AgentSet<zombietutorial.relogo.Infection> links = new AgentSet<zombietutorial.relogo.Infection>();
		for(Turtle t : a){
			links.add((zombietutorial.relogo.Infection)this.getMyObserver().getNetwork("Infection").addEdge(t,this));
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed infections from a collection to the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created infections
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet<zombietutorial.relogo.Infection> createInfectionsFrom(Collection<? extends Turtle> a){
		return createInfectionsFrom(a,null);
	}

	/**
	 * Makes a directed infection to a turtle from the caller then executes a set of
	 * commands on the created infection.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created infection
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public zombietutorial.relogo.Infection createInfectionTo(Turtle t, Closure closure){
		zombietutorial.relogo.Infection link = (zombietutorial.relogo.Infection)this.getMyObserver().getNetwork("Infection").addEdge(this,t);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed infection to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created infection
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public zombietutorial.relogo.Infection createInfectionTo(Turtle t){
			return createInfectionTo(t,null);
	}

	/**
	 * Makes directed infections to a collection from the caller then executes a set
	 * of commands on the created infections.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created infections
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet<zombietutorial.relogo.Infection> createInfectionsTo(Collection<? extends Turtle> a, Closure closure){
		AgentSet<zombietutorial.relogo.Infection> links = new AgentSet<zombietutorial.relogo.Infection>();
		for(Object t : a){
			if (t instanceof Turtle){
				links.add((zombietutorial.relogo.Infection)this.getMyObserver().getNetwork("Infection").addEdge(this,(Turtle)t));
			}
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed infections to a collection from the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created infections
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet<zombietutorial.relogo.Infection> createInfectionsTo(Collection<? extends Turtle> a){
		return createInfectionsTo(a,null);
	}

	/**
	 * Queries if there is a directed infection from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed infection from
	 *         turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public boolean inInfectionNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Infection").isPredecessor(t, this);
	}

	/**
	 * Returns the agentset with directed infections to the caller.
	 * 
	 * @return agentset with directed infections to the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet inInfectionNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Infection").getPredecessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed infection from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed infection from turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public zombietutorial.relogo.Infection inInfectionFrom(Turtle t){
		return (zombietutorial.relogo.Infection)this.getMyObserver().getNetwork("Infection").getEdge(t,this);
	}

	/**
	 * Returns an agentset of directed infections from other turtles to the caller.
	 * 
	 * @return agentset of directed infections from other turtles to the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet<zombietutorial.relogo.Infection> myInInfections(){
		AgentSet<zombietutorial.relogo.Infection> result = new AgentSet<zombietutorial.relogo.Infection>();
		for(Object o :  this.getMyObserver().getNetwork("Infection").getInEdges(this)){
			if (o instanceof zombietutorial.relogo.Infection){
				result.add((zombietutorial.relogo.Infection) o);
			}
		}
		return result;
	}

	/**
	 * Returns an agentset of directed infections to other turtles from the caller.
	 * 
	 * @return agentset of directed infections to other turtles from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet<zombietutorial.relogo.Infection> myOutInfections(){
		AgentSet<zombietutorial.relogo.Infection> result = new AgentSet<zombietutorial.relogo.Infection>();
		for(Object o :  this.getMyObserver().getNetwork("Infection").getOutEdges(this)){
			if (o instanceof zombietutorial.relogo.Infection){
				result.add((zombietutorial.relogo.Infection) o);
			}
		}
		return result;
	}

	/**
	 * Queries if there is a directed infection to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed infection to
	 *         turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public boolean outInfectionNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Infection").isPredecessor(this, t);
	}

	/**
	 * Returns the agentset with directed infections from the caller.
	 * 
	 * @return agentset with directed infections from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet outInfectionNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Infection").getSuccessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed infection to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed infection to turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public zombietutorial.relogo.Infection outInfectionTo(Turtle t){
		return (zombietutorial.relogo.Infection)this.getMyObserver().getNetwork("Infection").getEdge(this, t);
	}

	/**
	 * Reports true if there is a infection connecting t and the caller.
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public boolean infectionNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Infection").isAdjacent(this, t);
	}

	/**
	 * Returns the agentset of all turtles found at the other end of
	 * infections connected to the calling turtle.
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet infectionNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Infection").getAdjacent(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns an agentset of the caller's infections.
	 * 
	 * @return agentset of the caller's infections
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet<zombietutorial.relogo.Infection> myInfections(){
		AgentSet<zombietutorial.relogo.Infection> result = new AgentSet<zombietutorial.relogo.Infection>();
		for(Object o : this.getMyObserver().getNetwork("Infection").getEdges(this)){
			if (o instanceof zombietutorial.relogo.Infection){
				result.add((zombietutorial.relogo.Infection)o);
			}
		}
		return result;
	}

	/**
	 * Queries if object is a infection.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a infection
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public boolean isInfectionQ(Object o){
		return (o instanceof zombietutorial.relogo.Infection);
	}

	/**
	 * Returns an agentset containing all infections.
	 * 
	 * @return agentset of all infections
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public AgentSet<zombietutorial.relogo.Infection> infections(){
		AgentSet<zombietutorial.relogo.Infection> a = new AgentSet<zombietutorial.relogo.Infection>();
		for (Object e : this.getMyObserver().getContext().getObjects(zombietutorial.relogo.Infection.class)) {
			if (e instanceof zombietutorial.relogo.Infection){
				a.add((zombietutorial.relogo.Infection)e);
			}
		}
		return a;
	}

	/**
	 * Returns the infection between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return infection between two turtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public zombietutorial.relogo.Infection infection(Number oneEnd, Number otherEnd) {
		return (zombietutorial.relogo.Infection)(this.getMyObserver().getNetwork("Infection").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the infection between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return infection between two turtles
	 */
	@ReLogoBuilderGeneratedFor("zombietutorial.relogo.Infection")
	public zombietutorial.relogo.Infection infection(Turtle oneEnd, Turtle otherEnd) {
		return infection(oneEnd.getWho(), otherEnd.getWho());
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

	/**
	 * Returns the value of the global variable gestationPeriod.
	 *
	 * @return the value of the global variable gestationPeriod
	 */
	@ReLogoBuilderGeneratedFor("global: gestationPeriod")
	public Object getGestationPeriod(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("gestationPeriod");
	}

	/**
	 * Sets the value of the global variable gestationPeriod.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: gestationPeriod")
	public void setGestationPeriod(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("gestationPeriod",value);
	}


}