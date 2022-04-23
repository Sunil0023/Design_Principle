package dp.solid.lsp;

public abstract class SocialMedia {

	//@Support Facebook, Whatsapp, Instagram
	public abstract void chatWithFriends();
	
	//@Support Facebook, Instagram
	public abstract void publishPost(Object post);

	//@Support Facebook, Whatsapp, Instagram
	public abstract void sharePhotosVideos();

	//@Support Facebook, Whatsapp
	public abstract void GroupVideoCall();

}
