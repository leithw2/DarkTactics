package com.indiegen.darktactics;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.input.*;
import com.badlogic.gdx.input.GestureDetector.*;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.utils.viewport.*;
import com.indiegen.darktactics.titleScreen.*;

import com.badlogic.gdx.Game;
public class titleScreen implements Screen, GestureListener
{

	@Override
	public boolean touchDown(float p1, float p2, int p3, int p4)
	{
		// TODO: Implement this method
		//camera.position.set(p1*6,p1*6,0);
		//actor.setPosition(p1,p2);
		return false;
	}

	@Override
	public boolean tap(float p1, float p2, int p3, int p4)
	{
		// TODO: Implement this method
		thisGame.setScreen(new screen(thisGame,batch));
		return false;
	}

	@Override
	public boolean longPress(float p1, float p2)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean fling(float p1, float p2, int p3)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean pan(float p1, float p2, float p3, float p4)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean panStop(float p1, float p2, int p3, int p4)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean zoom(float p1, float p2)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean pinch(Vector2 p1, Vector2 p2, Vector2 p3, Vector2 p4)
	{
		// TODO: Implement this method
		return false;
	}

	Game thisGame;
	Batch batch;
	
	Viewport viewport;
	Camera camera;
	Stage stage;
	int hmiWidth=180;
	int hmiHeight=320;
	titles actor;
	//BackGound backGround;
	//Stars
	//Moon moon;
	//Clouds clouds;
	
	
	titleScreen(Game game,Batch batch){
		thisGame = game;
		this.batch=batch;
		
		camera = new OrthographicCamera(hmiWidth, hmiHeight);
		viewport = new FitViewport(hmiWidth,hmiHeight);
		viewport.setCamera(camera);
		stage = new Stage(viewport);
		viewport.apply();
		
		actor = new titles();
		
		stage.addActor(actor);
		GestureDetector gd = new GestureDetector(this);
		
		Gdx.input.setInputProcessor(gd);
	}

	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(0, 0, 0, 0);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//batch.setProjectionMatrix(camera.combined);
		//camera.update();
		//delta+=delta;
		// TODO: Implement this method
		//actor.setX(actor.getX()+delta);
		stage.act(delta);
		stage.draw();
	}

	@Override
	public void resize(int p1, int p2)
	{
		// TODO: Implement this method
	}

	@Override
	public void show()
	{
		// TODO: Implement this method
	}

	@Override
	public void hide()
	{
		// TODO: Implement this method
	}

	@Override
	public void pause()
	{
		// TODO: Implement this method
	}

	@Override
	public void resume()
	{
		// TODO: Implement this method
	}

	@Override
	public void dispose()
	{
		// TODO: Implement this method
	}

}
