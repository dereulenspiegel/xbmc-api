/*
 *      Copyright (C) 2005-2013 Team XBMC
 *      http://xbmc.org
 *
 *  This Program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2, or (at your option)
 *  any later version.
 *
 *  This Program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with XBMC Remote; see the file license.  If not, write to
 *  the Free Software Foundation, 675 Mass Ave, Cambridge, MA 02139, USA.
 *  http://www.gnu.org/copyleft/gpl.html
 *
 */
package org.xbmc.android.jsonrpc.api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;

public final class AudioModel {

	/**
	 * API Name: <tt>Audio.Details.Album</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class AlbumDetail extends MediaDetail {
		public final static String API_TYPE = "Audio.Details.Album";

		// field names
		public static final String ALBUMID = "albumid";
		public static final String ALBUMLABEL = "albumlabel";
		public static final String DESCRIPTION = "description";
		public static final String MOOD = "mood";
		public static final String PLAYCOUNT = "playcount";
		public static final String STYLE = "style";
		public static final String THEME = "theme";
		public static final String TYPE = "type";

		// class members
		public final Integer albumid;
		public final String albumlabel;
		public final String description;
		public final List<String> mood;
		public final Integer playcount;
		public final List<String> style;
		public final List<String> theme;
		public final String type;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a AlbumDetail object
		 */
		public AlbumDetail(JsonNode node) {
			super(node);
			albumid = parseInt(node, ALBUMID);
			albumlabel = parseString(node, ALBUMLABEL);
			description = parseString(node, DESCRIPTION);
			mood = getStringArray(node, MOOD);
			playcount = parseInt(node, PLAYCOUNT);
			style = getStringArray(node, STYLE);
			theme = getStringArray(node, THEME);
			type = parseString(node, TYPE);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(ALBUMID, albumid);
			node.put(ALBUMLABEL, albumlabel);
			node.put(DESCRIPTION, description);
			final ArrayNode moodArray = OM.createArrayNode();
			for (String item : mood) {
				moodArray.add(item);
			}
			node.put(MOOD, moodArray);
			node.put(PLAYCOUNT, playcount);
			final ArrayNode styleArray = OM.createArrayNode();
			for (String item : style) {
				styleArray.add(item);
			}
			node.put(STYLE, styleArray);
			final ArrayNode themeArray = OM.createArrayNode();
			for (String item : theme) {
				themeArray.add(item);
			}
			node.put(THEME, themeArray);
			node.put(TYPE, type);
			return node;
		}

		/**
		 * Extracts a list of {@link AlbumDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<AlbumDetail> getAudioModelAlbumDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<AlbumDetail> l = new ArrayList<AlbumDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new AlbumDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<AlbumDetail>(0);
		}

	}

	/**
	 * API Name: <tt>Audio.Details.Artist</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ArtistDetail extends BaseDetail {
		public final static String API_TYPE = "Audio.Details.Artist";

		// field names
		public static final String ARTIST = "artist";
		public static final String ARTISTID = "artistid";
		public static final String BORN = "born";
		public static final String COMPILATIONARTIST = "compilationartist";
		public static final String DESCRIPTION = "description";
		public static final String DIED = "died";
		public static final String DISBANDED = "disbanded";
		public static final String FORMED = "formed";
		public static final String INSTRUMENT = "instrument";
		public static final String MOOD = "mood";
		public static final String MUSICBRAINZARTISTID = "musicbrainzartistid";
		public static final String STYLE = "style";
		public static final String YEARSACTIVE = "yearsactive";

		// class members
		public final String artist;
		public final Integer artistid;
		public final String born;
		public final Boolean compilationartist;
		public final String description;
		public final String died;
		public final String disbanded;
		public final String formed;
		public final List<String> instrument;
		public final List<String> mood;
		public final String musicbrainzartistid;
		public final List<String> style;
		public final List<String> yearsactive;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a ArtistDetail object
		 */
		public ArtistDetail(JsonNode node) {
			super(node);
			artist = node.get(ARTIST).getTextValue(); // required value
			artistid = parseInt(node, ARTISTID);
			born = parseString(node, BORN);
			compilationartist = parseBoolean(node, COMPILATIONARTIST);
			description = parseString(node, DESCRIPTION);
			died = parseString(node, DIED);
			disbanded = parseString(node, DISBANDED);
			formed = parseString(node, FORMED);
			instrument = getStringArray(node, INSTRUMENT);
			mood = getStringArray(node, MOOD);
			musicbrainzartistid = parseString(node, MUSICBRAINZARTISTID);
			style = getStringArray(node, STYLE);
			yearsactive = getStringArray(node, YEARSACTIVE);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(ARTIST, artist);
			node.put(ARTISTID, artistid);
			node.put(BORN, born);
			node.put(COMPILATIONARTIST, compilationartist);
			node.put(DESCRIPTION, description);
			node.put(DIED, died);
			node.put(DISBANDED, disbanded);
			node.put(FORMED, formed);
			final ArrayNode instrumentArray = OM.createArrayNode();
			for (String item : instrument) {
				instrumentArray.add(item);
			}
			node.put(INSTRUMENT, instrumentArray);
			final ArrayNode moodArray = OM.createArrayNode();
			for (String item : mood) {
				moodArray.add(item);
			}
			node.put(MOOD, moodArray);
			node.put(MUSICBRAINZARTISTID, musicbrainzartistid);
			final ArrayNode styleArray = OM.createArrayNode();
			for (String item : style) {
				styleArray.add(item);
			}
			node.put(STYLE, styleArray);
			final ArrayNode yearsactiveArray = OM.createArrayNode();
			for (String item : yearsactive) {
				yearsactiveArray.add(item);
			}
			node.put(YEARSACTIVE, yearsactiveArray);
			return node;
		}

		/**
		 * Extracts a list of {@link ArtistDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<ArtistDetail> getAudioModelArtistDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<ArtistDetail> l = new ArrayList<ArtistDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new ArtistDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<ArtistDetail>(0);
		}
	}

	/**
	 * API Name: <tt>Audio.Details.Base</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class BaseDetail extends MediaModel.BaseDetail {
		public final static String API_TYPE = "Audio.Details.Base";

		// field names
		public static final String GENRE = "genre";

		// class members
		public final List<String> genre;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a BaseDetail object
		 */
		public BaseDetail(JsonNode node) {
			super(node);
			genre = getStringArray(node, GENRE);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			final ArrayNode genreArray = OM.createArrayNode();
			for (String item : genre) {
				genreArray.add(item);
			}
			node.put(GENRE, genreArray);
			return node;
		}

		/**
		 * Extracts a list of {@link BaseDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<BaseDetail> getAudioModelBaseDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<BaseDetail> l = new ArrayList<BaseDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new BaseDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<BaseDetail>(0);
		}

	}

	/**
	 * API Name: <tt>Audio.Details.Media</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class MediaDetail extends BaseDetail {
		public final static String API_TYPE = "Audio.Details.Media";

		// field names
		public static final String ARTIST = "artist";
		public static final String ARTISTID = "artistid";
		public static final String DISPLAYARTIST = "displayartist";
		public static final String GENREID = "genreid";
		public static final String MUSICBRAINZALBUMARTISTID = "musicbrainzalbumartistid";
		public static final String MUSICBRAINZALBUMID = "musicbrainzalbumid";
		public static final String RATING = "rating";
		public static final String TITLE = "title";
		public static final String YEAR = "year";

		// class members
		public final List<String> artist;
		public final List<Integer> artistid;
		public final String displayartist;
		public final List<Integer> genreid;
		public final String musicbrainzalbumartistid;
		public final String musicbrainzalbumid;
		public final Integer rating;
		public final String title;
		public final Integer year;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a MediaDetail object
		 */
		public MediaDetail(JsonNode node) {
			super(node);
			artist = getStringArray(node, ARTIST);
			artistid = getIntegerArray(node, ARTISTID);
			displayartist = parseString(node, DISPLAYARTIST);
			genreid = getIntegerArray(node, GENREID);
			musicbrainzalbumartistid = parseString(node, MUSICBRAINZALBUMARTISTID);
			musicbrainzalbumid = parseString(node, MUSICBRAINZALBUMID);
			rating = parseInt(node, RATING);
			title = parseString(node, TITLE);
			year = parseInt(node, YEAR);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			final ArrayNode artistArray = OM.createArrayNode();
			for (String item : artist) {
				artistArray.add(item);
			}
			node.put(ARTIST, artistArray);
			final ArrayNode artistidArray = OM.createArrayNode();
			for (Integer item : artistid) {
				artistidArray.add(item);
			}
			node.put(ARTISTID, artistidArray);
			node.put(DISPLAYARTIST, displayartist);
			final ArrayNode genreidArray = OM.createArrayNode();
			for (Integer item : genreid) {
				genreidArray.add(item);
			}
			node.put(GENREID, genreidArray);
			node.put(MUSICBRAINZALBUMARTISTID, musicbrainzalbumartistid);
			node.put(MUSICBRAINZALBUMID, musicbrainzalbumid);
			node.put(RATING, rating);
			node.put(TITLE, title);
			node.put(YEAR, year);
			return node;
		}

		/**
		 * Extracts a list of {@link MediaDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<MediaDetail> getAudioModelMediaDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<MediaDetail> l = new ArrayList<MediaDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new MediaDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<MediaDetail>(0);
		}

	}

	/**
	 * API Name: <tt>Audio.Details.Song</tt>
	 * <p/>
	 * Note: This class is used as result only.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SongDetail extends MediaDetail {
		public final static String API_TYPE = "Audio.Details.Song";

		// field names
		public static final String ALBUM = "album";
		public static final String ALBUMARTIST = "albumartist";
		public static final String ALBUMARTISTID = "albumartistid";
		public static final String ALBUMID = "albumid";
		public static final String COMMENT = "comment";
		public static final String DISC = "disc";
		public static final String DURATION = "duration";
		public static final String FILE = "file";
		public static final String LASTPLAYED = "lastplayed";
		public static final String LYRICS = "lyrics";
		public static final String MUSICBRAINZARTISTID = "musicbrainzartistid";
		public static final String MUSICBRAINZTRACKID = "musicbrainztrackid";
		public static final String PLAYCOUNT = "playcount";
		public static final String SONGID = "songid";
		public static final String TRACK = "track";

		// class members
		public final String album;
		public final List<String> albumartist;
		public final List<Integer> albumartistid;
		public final Integer albumid;
		public final String comment;
		public final Integer disc;
		public final Integer duration;
		public final String file;
		public final String lastplayed;
		public final String lyrics;
		public final String musicbrainzartistid;
		public final String musicbrainztrackid;
		public final Integer playcount;
		public final Integer songid;
		public final Integer track;

		/**
		 * Construct from JSON object.
		 * @param node JSON object representing a SongDetail object
		 */
		public SongDetail(JsonNode node) {
			super(node);
			album = parseString(node, ALBUM);
			albumartist = getStringArray(node, ALBUMARTIST);
			albumartistid = getIntegerArray(node, ALBUMARTISTID);
			albumid = parseInt(node, ALBUMID);
			comment = parseString(node, COMMENT);
			disc = parseInt(node, DISC);
			duration = parseInt(node, DURATION);
			file = parseString(node, FILE);
			lastplayed = parseString(node, LASTPLAYED);
			lyrics = parseString(node, LYRICS);
			musicbrainzartistid = parseString(node, MUSICBRAINZARTISTID);
			musicbrainztrackid = parseString(node, MUSICBRAINZTRACKID);
			playcount = parseInt(node, PLAYCOUNT);
			songid = parseInt(node, SONGID);
			track = parseInt(node, TRACK);
		}

		@Override
		public JsonNode toJsonNode() {
			final ObjectNode node = (ObjectNode)super.toJsonNode();
			node.put(ALBUM, album);
			final ArrayNode albumartistArray = OM.createArrayNode();
			for (String item : albumartist) {
				albumartistArray.add(item);
			}
			node.put(ALBUMARTIST, albumartistArray);
			final ArrayNode albumartistidArray = OM.createArrayNode();
			for (Integer item : albumartistid) {
				albumartistidArray.add(item);
			}
			node.put(ALBUMARTISTID, albumartistidArray);
			node.put(ALBUMID, albumid);
			node.put(COMMENT, comment);
			node.put(DISC, disc);
			node.put(DURATION, duration);
			node.put(FILE, file);
			node.put(LASTPLAYED, lastplayed);
			node.put(LYRICS, lyrics);
			node.put(MUSICBRAINZARTISTID, musicbrainzartistid);
			node.put(MUSICBRAINZTRACKID, musicbrainztrackid);
			node.put(PLAYCOUNT, playcount);
			node.put(SONGID, songid);
			node.put(TRACK, track);
			return node;
		}

		/**
		 * Extracts a list of {@link SongDetail} objects from a JSON array.
		 * @param node ObjectNode containing the list of objects.
		 * @param key Key pointing to the node where the list is stored.
		 */
		static List<SongDetail> getAudioModelSongDetailList(JsonNode node, String key) {
			if (node.has(key)) {
				final ArrayNode a = (ArrayNode)node.get(key);
				final List<SongDetail> l = new ArrayList<SongDetail>(a.size());
				for (int i = 0; i < a.size(); i++) {
					l.add(new SongDetail((JsonNode)a.get(i)));
				}
				return l;
			}
			return new ArrayList<SongDetail>(0);
		}

	}

	/**
	 * API Name: <tt>Audio.Fields.Album</tt>
	 */
	public interface AlbumFields {

		public final String TITLE = "title";
		public final String DESCRIPTION = "description";
		public final String ARTIST = "artist";
		public final String GENRE = "genre";
		public final String THEME = "theme";
		public final String MOOD = "mood";
		public final String STYLE = "style";
		public final String TYPE = "type";
		public final String ALBUMLABEL = "albumlabel";
		public final String RATING = "rating";
		public final String YEAR = "year";
		public final String MUSICBRAINZALBUMID = "musicbrainzalbumid";
		public final String MUSICBRAINZALBUMARTISTID = "musicbrainzalbumartistid";
		public final String FANART = "fanart";
		public final String THUMBNAIL = "thumbnail";
		public final String PLAYCOUNT = "playcount";
		public final String GENREID = "genreid";
		public final String ARTISTID = "artistid";
		public final String DISPLAYARTIST = "displayartist";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, DESCRIPTION, ARTIST, GENRE, THEME, MOOD, STYLE, TYPE, ALBUMLABEL, RATING, YEAR, MUSICBRAINZALBUMID, MUSICBRAINZALBUMARTISTID, FANART, THUMBNAIL, PLAYCOUNT, GENREID, ARTISTID, DISPLAYARTIST));
	}

	/**
	 * API Name: <tt>Audio.Fields.Artist</tt>
	 */
	public interface ArtistFields {

		public final String INSTRUMENT = "instrument";
		public final String STYLE = "style";
		public final String MOOD = "mood";
		public final String BORN = "born";
		public final String FORMED = "formed";
		public final String DESCRIPTION = "description";
		public final String GENRE = "genre";
		public final String DIED = "died";
		public final String DISBANDED = "disbanded";
		public final String YEARSACTIVE = "yearsactive";
		public final String MUSICBRAINZARTISTID = "musicbrainzartistid";
		public final String FANART = "fanart";
		public final String THUMBNAIL = "thumbnail";
		public final String COMPILATIONARTIST = "compilationartist";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(INSTRUMENT, STYLE, MOOD, BORN, FORMED, DESCRIPTION, GENRE, DIED, DISBANDED, YEARSACTIVE, MUSICBRAINZARTISTID, FANART, THUMBNAIL, COMPILATIONARTIST));
	}

	/**
	 * API Name: <tt>Audio.Fields.Song</tt>
	 */
	public interface SongFields {

		public final String TITLE = "title";
		public final String ARTIST = "artist";
		public final String ALBUMARTIST = "albumartist";
		public final String GENRE = "genre";
		public final String YEAR = "year";
		public final String RATING = "rating";
		public final String ALBUM = "album";
		public final String TRACK = "track";
		public final String DURATION = "duration";
		public final String COMMENT = "comment";
		public final String LYRICS = "lyrics";
		public final String MUSICBRAINZTRACKID = "musicbrainztrackid";
		public final String MUSICBRAINZARTISTID = "musicbrainzartistid";
		public final String MUSICBRAINZALBUMID = "musicbrainzalbumid";
		public final String MUSICBRAINZALBUMARTISTID = "musicbrainzalbumartistid";
		public final String PLAYCOUNT = "playcount";
		public final String FANART = "fanart";
		public final String THUMBNAIL = "thumbnail";
		public final String FILE = "file";
		public final String ALBUMID = "albumid";
		public final String LASTPLAYED = "lastplayed";
		public final String DISC = "disc";
		public final String GENREID = "genreid";
		public final String ARTISTID = "artistid";
		public final String DISPLAYARTIST = "displayartist";
		public final String ALBUMARTISTID = "albumartistid";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(TITLE, ARTIST, ALBUMARTIST, GENRE, YEAR, RATING, ALBUM, TRACK, DURATION, COMMENT, LYRICS, MUSICBRAINZTRACKID, MUSICBRAINZARTISTID, MUSICBRAINZALBUMID, MUSICBRAINZALBUMARTISTID, PLAYCOUNT, FANART, THUMBNAIL, FILE, ALBUMID, LASTPLAYED, DISC, GENREID, ARTISTID, DISPLAYARTIST, ALBUMARTISTID));
	}
}
