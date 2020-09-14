package pt.keifuz.reparar.utils;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ActionBar {
  @SuppressWarnings("rawtypes")
public static void sendAction(Player paramPlayer, String paramString) {
    PacketPlayOutChat packetPlayOutChat = new PacketPlayOutChat(IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + paramString + "\"}"), (byte)2);
    (((CraftPlayer)paramPlayer).getHandle()).playerConnection.sendPacket((Packet)packetPlayOutChat);
  }
}
