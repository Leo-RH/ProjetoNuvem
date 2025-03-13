package projeto.nuvem.projetoNuvem.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.nuvem.projetoNuvem.Entities.Game;



@RestController
@CrossOrigin
public class GameController{
    Game[] games = {
            new Game("CS:GO", "Tatical Bomb Game", "https://media.steampowered.com/apps/csgo/blog/images/fb_image.png?v=6", "Steam", "Valve", "Valve"),
            new Game("CS2", "Sequence of Tatical Bomb Game", "https://cdn.akamai.steamstatic.com/apps/csgo/images/csgo_react/social/cs2.jpg", "Steam", "Valve", "Valve"),
            new Game("Marvel Rivals", "Marvel hero shooter", "https://cdn1.epicgames.com/spt-assets/eb15454c010f4a748498cd3a62096a52/marvel-rivals-wq3mr.png", "Epic Games", "NetEase Games", "NetEase Games"),
            new Game("Marvel Spiderman 2", "Spiderman Game", "https://image.api.playstation.com/vulcan/ap/rnd/202306/1219/1c7b75d8ed9271516546560d219ad0b22ee0a263b4537bd8.png", "Playstation", "Insomniac Games", "Playstation Publishing"),
            new Game("Forza Horizon 5", "Race game in México", "https://upload.wikimedia.org/wikipedia/pt/d/dc/Capa_de_Forza_Horizon_5.jpg", "Xbox", "Playground Games", "Xbox Games Studios"),
            new Game("Super Smash Bros. Ultimate", "Ultimate Nintendo brawl game", "https://assets.nintendo.com/image/upload/q_auto/f_auto/ncom/software/switch/70010000012332/ac4d1fc9824876ce756406f0525d50c57ded4b2a666f6dfe40a6ac5c3563fad9", "Nintendo", "Bandai Namco Studios", "Nintendo")
    };

    @GetMapping("/games")
    public Game[] getGames(){
        return games;
    }



}
