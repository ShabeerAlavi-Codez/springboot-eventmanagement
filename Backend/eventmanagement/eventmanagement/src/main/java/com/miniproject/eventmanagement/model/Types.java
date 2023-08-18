package com.miniproject.eventmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private boolean Hotel;
    private boolean PartyHall;
    private boolean FoodServies;
    private boolean Decoration;
    private boolean SoundSystem;
    public Types() {
    }
    public Types(int id, boolean hotel, boolean partyHall, boolean foodServies, boolean decoration,
            boolean soundSystem) {
        Id = id;
        Hotel = hotel;
        PartyHall = partyHall;
        FoodServies = foodServies;
        Decoration = decoration;
        SoundSystem = soundSystem;
    }
    public void setId(int id) {
        Id = id;
    }
    public void setHotel(boolean hotel) {
        Hotel = hotel;
    }
    public void setPartyHall(boolean partyHall) {
        PartyHall = partyHall;
    }
    public void setFoodServies(boolean foodServies) {
        FoodServies = foodServies;
    }
    public void setDecoration(boolean decoration) {
        Decoration = decoration;
    }
    public void setSoundSystem(boolean soundSystem) {
        SoundSystem = soundSystem;
    }
    public int getId() {
        return Id;
    }
    public boolean isHotel() {
        return Hotel;
    }
    public boolean isPartyHall() {
        return PartyHall;
    }
    public boolean isFoodServies() {
        return FoodServies;
    }
    public boolean isDecoration() {
        return Decoration;
    }
    public boolean isSoundSystem() {
        return SoundSystem;
    }
    
}
