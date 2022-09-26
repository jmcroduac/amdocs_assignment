package com.training.day8_assignment.playlist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlaylistMain {
    public static void main(String[] args) {
        PlaylistQueue playlist = new PlaylistQueue(5);
        Scanner scanner = new Scanner(System.in);

        int ans = 0;

        try{
            while(ans != 4){
                System.out.println("Song Playlist Menu:");
                System.out.println("1. Add song");
                System.out.println("2. Play song");
                System.out.println("3. Display number of remaining songs");
                System.out.println("4. Exit");
                System.out.print("Enter number of desired action: ");
                ans = scanner.nextInt();
                scanner.nextLine();

                if(ans == 1){
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    playlist.addSong(title);
                }else if(ans == 2){
                    playlist.playSong();
                }else if(ans == 3) {
                    playlist.remainingSongs();
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Enter valid values only.");
        }

    }
}
