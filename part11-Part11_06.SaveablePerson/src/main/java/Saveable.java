/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BELLAJ MED
 */
public interface Saveable {
	public void save();
	public void delete();
	public void load(String address);
}