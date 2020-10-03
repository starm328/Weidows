/*
 * @Author: Weidows
 * @Date: 2020-07-08 18:58:48
 * @LastEditors: Weidows
 * @LastEditTime: 2020-07-18 16:23:25
 * @FilePath: \Weidows\Java\src\main\java\twenty\july\design_principle\newcastle\Handler.java
 */ 
package twenty.july.design_principle.newcastle;

public class Handler {
    protected Game game;

    public Handler(Game game) {
        this.game = game;
    }
    public void doCmd(String word) {}

	public boolean isBye() {
		return false;
	}
}