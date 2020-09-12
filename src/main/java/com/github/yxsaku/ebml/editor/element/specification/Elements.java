package com.github.yxsaku.ebml.editor.element.specification;

import com.github.yxsaku.ebml.editor.Reader;
import com.github.yxsaku.ebml.editor.element.base.BinaryElement;
import com.github.yxsaku.ebml.editor.element.base.BlockElement;
import com.github.yxsaku.ebml.editor.element.base.DateElement;
import com.github.yxsaku.ebml.editor.element.base.Element;
import com.github.yxsaku.ebml.editor.element.base.FloatElement;
import com.github.yxsaku.ebml.editor.element.base.MasterElement;
import com.github.yxsaku.ebml.editor.element.base.SignedIntegerElement;
import com.github.yxsaku.ebml.editor.element.base.StringElement;
import com.github.yxsaku.ebml.editor.element.base.UnsignedIntegerElement;

public class Elements {
    public static final int AlphaMode = 0x53c0;
    public static final int AspectRatioType = 0x54b3;
    public static final int AttachedFile = 0x61a7;
    public static final int AttachmentLink = 0x7446;
    public static final int Attachments = 0x1941a469;
    public static final int Audio = 0xe1;
    public static final int BitDepth = 0x6264;
    public static final int Block = 0xa1;
    public static final int BlockAddID = 0xee;
    public static final int BlockAdditionID = 0xcb;
    public static final int BlockAdditional = 0xa5;
    public static final int BlockAdditions = 0x75a1;
    public static final int BlockDuration = 0x9b;
    public static final int BlockGroup = 0xa0;
    public static final int BlockMore = 0xa6;
    public static final int BlockVirtual = 0xa2;
    public static final int CRC32 = 0xbf;
    public static final int ChannelPositions = 0x7d7b;
    public static final int Channels = 0x9f;
    public static final int ChapCountry = 0x437e;
    public static final int ChapLanguage = 0x437c;
    public static final int ChapProcess = 0x6944;
    public static final int ChapProcessCodecID = 0x6955;
    public static final int ChapProcessCommand = 0x6911;
    public static final int ChapProcessData = 0x6933;
    public static final int ChapProcessPrivate = 0x450d;
    public static final int ChapProcessTime = 0x6922;
    public static final int ChapString = 0x85;
    public static final int ChapterAtom = 0xb6;
    public static final int ChapterDisplay = 0x80;
    public static final int ChapterFlagEnabled = 0x4598;
    public static final int ChapterFlagHidden = 0x98;
    public static final int ChapterPhysicalEquiv = 0x63c3;
    public static final int ChapterSegmentEditionUID = 0x6ebc;
    public static final int ChapterSegmentUID = 0x6e67;
    public static final int ChapterStringUID = 0x5654;
    public static final int ChapterTimeEnd = 0x92;
    public static final int ChapterTimeStart = 0x91;
    public static final int ChapterTrack = 0x8f;
    public static final int ChapterTrackNumber = 0x89;
    public static final int ChapterTranslate = 0x6924;
    public static final int ChapterTranslateCodec = 0x69bf;
    public static final int ChapterTranslateEditionUID = 0x69fc;
    public static final int ChapterTranslateID = 0x69a5;
    public static final int ChapterUID = 0x73c4;
    public static final int Chapters = 0x1043a770;
    public static final int Cluster = 0x1f43b675;
    public static final int CodecDecodeAll = 0xaa;
    public static final int CodecDelay = 0x56aa;
    public static final int CodecDownloadURL = 0x26b240;
    public static final int CodecID = 0x86;
    public static final int CodecInfoURL = 0x3b4040;
    public static final int CodecName = 0x258688;
    public static final int CodecPrivate = 0x63a2;
    public static final int CodecSettings = 0x3a9697;
    public static final int ColourSpace = 0x2eb524;
    public static final int CodecState = 0xa4;
    public static final int ContentCompAlgo = 0x4254;
    public static final int ContentCompSettings = 0x4255;
    public static final int ContentCompression = 0x5034;
    public static final int ContentEncAlgo = 0x47e1;
    public static final int ContentEncKeyID = 0x47e2;
    public static final int ContentEncoding = 0x6240;
    public static final int ContentEncodingOrder = 0x5031;
    public static final int ContentEncodingScope = 0x5032;
    public static final int ContentEncodingType = 0x5033;
    public static final int ContentEncodings = 0x6d80;
    public static final int ContentEncryption = 0x5035;
    public static final int ContentSigAlgo = 0x47e5;
    public static final int ContentSigHashAlgo = 0x47e6;
    public static final int ContentSigKeyID = 0x47e4;
    public static final int ContentSignature = 0x47e3;
    public static final int CueBlockNumber = 0x5378;
    public static final int CueClusterPosition = 0xf1;
    public static final int CueCodecState = 0xea;
    public static final int CueDuration = 0xb2;
    public static final int CuePoint = 0xbb;
    public static final int CueRefCluster = 0x97;
    public static final int CueRefCodecState = 0xeb;
    public static final int CueRefNumber = 0x535f;
    public static final int CueRefTime = 0x96;
    public static final int CueReference = 0xdb;
    public static final int CueRelativePosition = 0xf0;
    public static final int CueTime = 0xb3;
    public static final int CueTrack = 0xf7;
    public static final int CueTrackPositions = 0xb7;
    public static final int Cues = 0x1c53bb6b;
    public static final int DateUTC = 0x4461;
    public static final int DefaultDecodedFieldDuration = 0x234e7a;
    public static final int DefaultDuration = 0x23e383;
    public static final int Delay = 0xce;
    public static final int DiscardPadding = 0x75a2;
    public static final int DisplayHeight = 0x54ba;
    public static final int DisplayUnit = 0x54b2;
    public static final int DisplayWidth = 0x54b0;
    public static final int DocType = 0x4282;
    public static final int DocTypeReadVersion = 0x4285;
    public static final int DocTypeVersion = 0x4287;
    public static final int Duration = 0x4489;
    public static final int EBML = 0x1a45dfa3;
    public static final int EBMLMaxIDLength = 0x42f2;
    public static final int EBMLMaxSizeLength = 0x42f3;
    public static final int EBMLReadVersion = 0x42f7;
    public static final int EBMLVersion = 0x4286;
    public static final int EditionEntry = 0x45b9;
    public static final int EditionFlagDefault = 0x45db;
    public static final int EditionFlagHidden = 0x45bd;
    public static final int EditionFlagOrdered = 0x45dd;
    public static final int EditionUID = 0x45bc;
    public static final int EncryptedBlock = 0xaf;
    public static final int FileData = 0x465c;
    public static final int FileDescription = 0x467e;
    public static final int FileMimeType = 0x4660;
    public static final int FileName = 0x466e;
    public static final int FileReferral = 0x4675;
    public static final int FileUID = 0x46ae;
    public static final int FileUsedEndTime = 0x4662;
    public static final int FileUsedStartTime = 0x4661;
    public static final int FlagDefault = 0x88;
    public static final int FlagEnabled = 0xb9;
    public static final int FlagForced = 0x55aa;
    public static final int FlagInterlaced = 0x9a;
    public static final int FlagLacing = 0x9c;
    public static final int FrameNumber = 0xcd;
    public static final int FrameRate = 0x2383e3;
    public static final int GammaValue = 0x2fb523;
    public static final int Info = 0x1549a966;
    public static final int LaceNumber = 0xcc;
    public static final int Language = 0x22b59c;
    public static final int MaxBlockAdditionID = 0x55ee;
    public static final int MaxCache = 0x6df8;
    public static final int MinCache = 0x6de7;
    public static final int MuxingApp = 0x4d80;
    public static final int Name = 0x536e;
    public static final int NextFilename = 0x3e83bb;
    public static final int NextUID = 0x3eb923;
    public static final int OldStereoMode = 0x53b9;
    public static final int OutputSamplingFrequency = 0x78b5;
    public static final int PixelCropBottom = 0x54aa;
    public static final int PixelCropLeft = 0x54cc;
    public static final int PixelCropRight = 0x54dd;
    public static final int PixelCropTop = 0x54bb;
    public static final int PixelHeight = 0xba;
    public static final int PixelWidth = 0xb0;
    public static final int Position = 0xa7;
    public static final int PrevFilename = 0x3c83ab;
    public static final int PrevSize = 0xab;
    public static final int PrevUID = 0x3cb923;
    public static final int ReferenceBlock = 0xfb;
    public static final int ReferenceFrame = 0xc8;
    public static final int ReferenceOffset = 0xc9;
    public static final int ReferencePriority = 0xfa;
    public static final int ReferenceTimeCode = 0xca;
    public static final int ReferenceVirtual = 0xfd;
    public static final int SamplingFrequency = 0xb5;
    public static final int Seek = 0x4dbb;
    public static final int SeekHead = 0x114d9b74;
    public static final int SeekID = 0x53ab;
    public static final int SeekPosition = 0x53ac;
    public static final int SeekPreRoll = 0x56bb;
    public static final int Segment = 0x18538067;
    public static final int SegmentFamily = 0x4444;
    public static final int SegmentFilename = 0x7384;
    public static final int SegmentUID = 0x73a4;
    public static final int Signature = 0x7eb5;
    public static final int SignatureAlgo = 0x7e8a;
    public static final int SignatureElementList = 0x7e7b;
    public static final int SignatureElements = 0x7e5b;
    public static final int SignatureHash = 0x7e9a;
    public static final int SignaturePublicKey = 0x7ea5;
    public static final int SignatureSlot = 0x1b538667;
    public static final int SignedElement = 0x6532;
    public static final int SilentTrackNumber = 0x58d7;
    public static final int SilentTracks = 0x5854;
    public static final int SimpleBlock = 0xa3;
    public static final int SimpleTag = 0x67c8;
    public static final int SliceDuration = 0xcf;
    public static final int Slices = 0x8e;
    public static final int StereoMode = 0x53b8;
    public static final int Tag = 0x7373;
    public static final int TagAttachmentUID = 0x63c6;
    public static final int TagBinary = 0x4485;
    public static final int TagChapterUID = 0x63c4;
    public static final int TagDefault = 0x4484;
    public static final int TagEditionUID = 0x63c9;
    public static final int TagLanguage = 0x447a;
    public static final int TagName = 0x45a3;
    public static final int TagString = 0x4487;
    public static final int TagTrackUID = 0x63c5;
    public static final int Tags = 0x1254c367;
    public static final int TargetType = 0x63ca;
    public static final int TargetTypeValue = 0x68ca;
    public static final int Targets = 0x63c0;
    public static final int TimeSlice = 0xe8;
    public static final int Timecode = 0xe7;
    public static final int TimecodeScale = 0x2ad7b1;
    public static final int TimecodeScaleDenominator = 0x2ad7b2;
    public static final int Title = 0x7ba9;
    public static final int TrackCombinePlanes = 0xe3;
    public static final int TrackEntry = 0xae;
    public static final int TrackJoinBlocks = 0xe9;
    public static final int TrackJoinUID = 0xed;
    public static final int TrackNumber = 0xd7;
    public static final int TrackOffset = 0x537f;
    public static final int TrackOperation = 0xe2;
    public static final int TrackOverlay = 0x6fab;
    public static final int TrackPlane = 0xe4;
    public static final int TrackPlaneType = 0xe6;
    public static final int TrackPlaneUID = 0xe5;
    public static final int TrackTimecodeScale = 0x23314f;
    public static final int TrackTranslate = 0x6624;
    public static final int TrackTranslateCodec = 0x66bf;
    public static final int TrackTranslateEditionUID = 0x66fc;
    public static final int TrackTranslateTrackID = 0x66a5;
    public static final int TrackType = 0x83;
    public static final int TrackUID = 0x73c5;
    public static final int Tracks = 0x1654ae6b;
    public static final int TrickMasterTrackSegmentUID = 0xc4;
    public static final int TrickMasterTrackUID = 0xc7;
    public static final int TrickTrackFlag = 0xc6;
    public static final int TrickTrackSegmentUID = 0xc1;
    public static final int TrickTrackUID = 0xc0;
    public static final int Video = 0xe0;
    public static final int Void = 0xec;
    public static final int WritingApp = 0x5741;

    public static Element createElementById(Reader reader, Integer elmId) {
        Element newElm;
        switch (elmId) {
        case AlphaMode:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x53c0;
            newElm.name = "AlphaMode";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.webm = true;
            newElm.defaultValue = 0;
            newElm.description = "Alpha Video Mode. Presence of this element indicates that the BlockAdditional element could contain Alpha data.";
            return newElm;
        case AspectRatioType:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x54b3;
            newElm.name = "AspectRatioType";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "Specify the possible modifications to the aspect ratio (0: free resizing, 1: keep aspect ratio, 2: fixed).";
            return newElm;
        case AttachedFile:
            newElm = new MasterElement();
            newElm.id = 0x61a7;
            newElm.name = "AttachedFile";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "An attached file.";
            return newElm;
        case AttachmentLink:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x7446;
            newElm.name = "AttachmentLink";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.range = v -> v != 0;
            newElm.description = "The UID of an attachment that is used by this codec.";
            return newElm;
        case Attachments:
            newElm = new MasterElement();
            newElm.id = 0x1941a469;
            newElm.name = "Attachments";
            newElm.level = 1;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "Contain attached files.";
            return newElm;
        case Audio:
            newElm = new MasterElement();
            newElm.id = 0xe1;
            newElm.name = "Audio";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.description = "Audio settings.";
            return newElm;
        case BitDepth:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x6264;
            newElm.name = "BitDepth";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.range = v -> v != 0;
            newElm.description = "Bits per sample, mostly used for PCM.";
            return newElm;
        case Block:
            newElm = new BlockElement(reader);
            newElm.id = 0xa1;
            newElm.name = "Block";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.mandatory = true;
            newElm.description = "Block containing the actual data to be rendered and a timestamp relative to the Cluster Timecode. (see Block Structure)";
            return newElm;
        case BlockAddID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xee;
            newElm.name = "BlockAddID";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 1;
            newElm.range = v -> v != 0;
            newElm.description = "An ID to identify the BlockAdditional level.";
            return newElm;
        case BlockAdditionID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xcb;
            newElm.name = "BlockAdditionID";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "The ID of the BlockAdditional element (0 is the main Block).";
            return newElm;
        case BlockAdditional:
            newElm = new BinaryElement(reader);
            newElm.id = 0xa5;
            newElm.name = "BlockAdditional";
            newElm.level = 5;
            newElm.type = Type.Binary;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "Interpreted by the codec as it wishes (using the BlockAddID).";
            return newElm;
        case BlockAdditions:
            newElm = new MasterElement();
            newElm.id = 0x75a1;
            newElm.name = "BlockAdditions";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "Contain additional blocks to complete the main one. An EBML parser that has no knowledge of the Block structure could still see and use/skip these data.";
            return newElm;
        case BlockDuration:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x9b;
            newElm.name = "BlockDuration";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = "TrackDuration";
            newElm.description = "The duration of the Block (based on TimecodeScale). This element is mandatory when DefaultDuration is set for the track (but can be omitted as other default values). When not written and with no DefaultDuration, the value is assumed to be the difference between the timestamp of this Block and the timestamp of the next Block in \"display\" order (not coding order). This element can be useful at the end of a Track (as there is not other Block available), or when there is a break in a track like for subtitle tracks. When set to 0 that means the frame is not a keyframe.";
            return newElm;
        case BlockGroup:
            newElm = new MasterElement();
            newElm.id = 0xa0;
            newElm.name = "BlockGroup";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.description = "Basic container of information containing a single Block or BlockVirtual, and information specific to that Block/VirtualBlock.";
            return newElm;
        case BlockMore:
            newElm = new MasterElement();
            newElm.id = 0xa6;
            newElm.name = "BlockMore";
            newElm.level = 4;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Contain the BlockAdditional and some parameters.";
            return newElm;
        case BlockVirtual:
            newElm = new BinaryElement(reader);
            newElm.id = 0xa2;
            newElm.name = "BlockVirtual";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "A Block with no data. It must be stored in the stream at the place the real Block should be in display order. (see Block Virtual)";
            return newElm;
        case CRC32:
            newElm = new BinaryElement(reader);
            newElm.id = 0xbf;
            newElm.name = "CRC-32";
            newElm.level = -1;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "The CRC is computed on all the data of the Master element it's in. The CRC element should be the first in it's parent master for easier reading. All level 1 elements should include a CRC-32. The CRC in use is the IEEE CRC32 Little Endian";
            return newElm;
        case ChannelPositions:
            newElm = new BinaryElement(reader);
            newElm.id = 0x7d7b;
            newElm.name = "ChannelPositions";
            newElm.level = 4;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "Table of horizontal angles for each successive channel, see appendix.";
            return newElm;
        case Channels:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x9f;
            newElm.name = "Channels";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 1;
            newElm.range = v -> v != 0;
            newElm.description = "Numbers of channels in the track.";
            return newElm;
        case ChapCountry:
            newElm = new StringElement(reader);
            newElm.id = 0x437e;
            newElm.name = "ChapCountry";
            newElm.level = 5;
            newElm.type = Type.Ascii;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "The countries corresponding to the string, same 2 octets as in Internet domains.";
            return newElm;
        case ChapLanguage:
            newElm = new StringElement(reader);
            newElm.id = 0x437c;
            newElm.name = "ChapLanguage";
            newElm.level = 5;
            newElm.type = Type.Ascii;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = true;
            newElm.defaultValue = "eng";
            newElm.description = "The languages corresponding to the string, in the bibliographic ISO-639-2 form.";
            return newElm;
        case ChapProcess:
            newElm = new MasterElement();
            newElm.id = 0x6944;
            newElm.name = "ChapProcess";
            newElm.level = 4;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Contains all the commands associated to the Atom.";
            return newElm;
        case ChapProcessCodecID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x6955;
            newElm.name = "ChapProcessCodecID";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "Contains the type of the codec used for the processing. A value of 0 means native Matroska processing (to be defined), a value of 1 means the DVD command set is used. More codec IDs can be added later.";
            return newElm;
        case ChapProcessCommand:
            newElm = new MasterElement();
            newElm.id = 0x6911;
            newElm.name = "ChapProcessCommand";
            newElm.level = 5;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Contains all the commands associated to the Atom.";
            return newElm;
        case ChapProcessData:
            newElm = new BinaryElement(reader);
            newElm.id = 0x6933;
            newElm.name = "ChapProcessData";
            newElm.level = 6;
            newElm.type = Type.Binary;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "Contains the command information. The data should be interpreted depending on the ChapProcessCodecID value. For ChapProcessCodecID = 1, the data correspond to the binary DVD cell pre/post commands.";
            return newElm;
        case ChapProcessPrivate:
            newElm = new BinaryElement(reader);
            newElm.id = 0x450d;
            newElm.name = "ChapProcessPrivate";
            newElm.level = 5;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "Some optional data attached to the ChapProcessCodecID information. For ChapProcessCodecID = 1, it is the \"DVD level\" equivalent.";
            return newElm;
        case ChapProcessTime:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x6922;
            newElm.name = "ChapProcessTime";
            newElm.level = 6;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "Defines when the process command should be handled (0: during the whole chapter, 1: before starting playback, 2: after playback of the chapter).";
            return newElm;
        case ChapString:
            newElm = new StringElement(reader);
            newElm.id = 0x85;
            newElm.name = "ChapString";
            newElm.level = 5;
            newElm.type = Type.Utf8;
            newElm.mandatory = true;
            newElm.webm = true;
            newElm.description = "Contains the string to use as the chapter atom.";
            return newElm;
        case ChapterAtom:
            newElm = new MasterElement();
            newElm.id = 0xb6;
            newElm.name = "ChapterAtom";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = true;
            newElm.description = "Contains the atom information to use as the chapter atom (apply to all tracks).";
            return newElm;
        case ChapterDisplay:
            newElm = new MasterElement();
            newElm.id = 0x80;
            newElm.name = "ChapterDisplay";
            newElm.level = 4;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.webm = true;
            newElm.description = "Contains all possible strings to use for the chapter display.";
            return newElm;
        case ChapterFlagEnabled:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x4598;
            newElm.name = "ChapterFlagEnabled";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 1;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "Specify wether the chapter is enabled. It can be enabled/disabled by a Control Track. When disabled, the movie should skip all the content between the TimeStart and TimeEnd of this chapter (see flag notes). (1 bit)";
            return newElm;
        case ChapterFlagHidden:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x98;
            newElm.name = "ChapterFlagHidden";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "If a chapter is hidden (1), it should not be available to the user interface (but still to Control Tracks; see flag notes). (1 bit)";
            return newElm;
        case ChapterPhysicalEquiv:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x63c3;
            newElm.name = "ChapterPhysicalEquiv";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.description = "Specify the physical equivalent of this ChapterAtom like \"DVD\" (60) or \"SIDE\" (50), see complete list of values.";
            return newElm;
        case ChapterSegmentEditionUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x6ebc;
            newElm.name = "ChapterSegmentEditionUID";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.range = v -> v != 0;
            newElm.description = "The EditionUID to play from the segment linked in ChapterSegmentUID.";
            return newElm;
        case ChapterSegmentUID:
            newElm = new BinaryElement(reader);
            newElm.id = 0x6e67;
            newElm.name = "ChapterSegmentUID";
            newElm.level = 4;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.range = v -> v > 0;
            newElm.description = "A segment to play in place of this chapter. Edition ChapterSegmentEditionUID should be used for this segment, otherwise no edition is used.";
            return newElm;
        case ChapterStringUID:
            newElm = new StringElement(reader);
            newElm.id = 0x5654;
            newElm.name = "ChapterStringUID";
            newElm.level = 4;
            newElm.type = Type.Utf8;
            newElm.mandatory = false;
            newElm.webm = true;
            newElm.description = "A unique string ID to identify the Chapter. Use for WebVTT cue identifier storage.";
            return newElm;
        case ChapterTimeEnd:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x92;
            newElm.name = "ChapterTimeEnd";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.description = "Timestamp of the end of Chapter (timestamp excluded, not scaled).";
            return newElm;
        case ChapterTimeStart:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x91;
            newElm.name = "ChapterTimeStart";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = true;
            newElm.description = "Timestamp of the start of Chapter (not scaled).";
            return newElm;
        case ChapterTrack:
            newElm = new MasterElement();
            newElm.id = 0x8f;
            newElm.name = "ChapterTrack";
            newElm.level = 4;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "List of tracks on which the chapter applies. If this element is not present, all tracks apply";
            return newElm;
        case ChapterTrackNumber:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x89;
            newElm.name = "ChapterTrackNumber";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.range = v -> v != 0;
            newElm.description = "UID of the Track to apply this chapter too. In the absense of a control track, choosing this chapter will select the listed Tracks and deselect unlisted tracks. Absense of this element indicates that the Chapter should be applied to any currently used Tracks.";
            return newElm;
        case ChapterTranslate:
            newElm = new MasterElement();
            newElm.id = 0x6924;
            newElm.name = "ChapterTranslate";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "A tuple of corresponding ID used by chapter codecs to represent this segment.";
            return newElm;
        case ChapterTranslateCodec:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x69bf;
            newElm.name = "ChapterTranslateCodec";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "The chapter codec using this ID (0: Matroska Script, 1: DVD-menu).";
            return newElm;
        case ChapterTranslateEditionUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x69fc;
            newElm.name = "ChapterTranslateEditionUID";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Specify an edition UID on which this correspondance applies. When not specified, it means for all editions found in the segment.";
            return newElm;
        case ChapterTranslateID:
            newElm = new BinaryElement(reader);
            newElm.id = 0x69a5;
            newElm.name = "ChapterTranslateID";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "The binary value used to represent this segment in the chapter codec data. The format depends on the ChapProcessCodecID used.";
            return newElm;
        case ChapterUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x73c4;
            newElm.name = "ChapterUID";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = true;
            newElm.range = v -> v != 0;
            newElm.description = "A unique ID to identify the Chapter.";
            return newElm;
        case Chapters:
            newElm = new MasterElement();
            newElm.id = 0x1043a770;
            newElm.name = "Chapters";
            newElm.level = 1;
            newElm.type = Type.Master;
            newElm.webm = true;
            newElm.description = "A system to define basic menus and partition data. For more detailed information, look at the Chapters Explanation.";
            return newElm;
        case Cluster:
            newElm = new MasterElement();
            newElm.id = 0x1f43b675;
            newElm.name = "Cluster";
            newElm.level = 1;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.description = "The lower level element containing the (monolithic) Block structure.";
            return newElm;
        case CodecDecodeAll:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xaa;
            newElm.name = "CodecDecodeAll";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 1;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "The codec can decode potentially damaged data (1 bit).";
            return newElm;
        case CodecDelay:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x56aa;
            newElm.name = "CodecDelay";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = false;
            newElm.defaultValue = 0;
            newElm.webm = true;
            newElm.description = "CodecDelay is The codec-built-in delay in nanoseconds. This value must be subtracted from each block timestamp in order to get the actual timestamp. The value should be small so the muxing of tracks with the same actual timestamp are in the same Cluster.";
            return newElm;
        case CodecDownloadURL:
            newElm = new StringElement(reader);
            newElm.id = 0x26b240;
            newElm.name = "CodecDownloadURL";
            newElm.level = 3;
            newElm.type = Type.Ascii;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "A URL to download about the codec used.";
            return newElm;
        case CodecID:
            newElm = new StringElement(reader);
            newElm.id = 0x86;
            newElm.name = "CodecID";
            newElm.level = 3;
            newElm.type = Type.Ascii;
            newElm.mandatory = true;
            newElm.description = "An ID corresponding to the codec, see the codec page for more info.";
            return newElm;
        case CodecInfoURL:
            newElm = new StringElement(reader);
            newElm.id = 0x3b4040;
            newElm.name = "CodecInfoURL";
            newElm.level = 3;
            newElm.type = Type.Ascii;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "A URL to find information about the codec used.";
            return newElm;
        case CodecName:
            newElm = new StringElement(reader);
            newElm.id = 0x258688;
            newElm.name = "CodecName";
            newElm.level = 3;
            newElm.type = Type.Utf8;
            newElm.description = "A human-readable string specifying the codec.";
            return newElm;
        case CodecPrivate:
            newElm = new BinaryElement(reader);
            newElm.id = 0x63a2;
            newElm.name = "CodecPrivate";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.description = "Private data only known to the codec.";
            return newElm;
        case CodecSettings:
            newElm = new StringElement(reader);
            newElm.id = 0x3a9697;
            newElm.name = "CodecSettings";
            newElm.level = 3;
            newElm.type = Type.Utf8;
            newElm.webm = false;
            newElm.description = "A string describing the encoding setting used.";
            return newElm;
        case ColourSpace:
            newElm = new BinaryElement(reader);
            newElm.id = 0x2eb524;
            newElm.name = "ColourSpace";
            newElm.level = 4;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "Same value as in AVI (32 bits).";
            return newElm;
        case CodecState:
            newElm = new BinaryElement(reader);
            newElm.id = 0xa4;
            newElm.name = "CodecState";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "The new codec state to use. Data interpretation is private to the codec. This information should always be referenced by a seek entry.";
            return newElm;
        case ContentCompAlgo:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x4254;
            newElm.name = "ContentCompAlgo";
            newElm.level = 6;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            // "br": [ "", "", "", "" ], // "del": [ "1 - bzlib,", "2 - lzo1x" ], //
            // description = "The compression algorithm used. Algorithms that have been //
            // specified so far are: 0 - zlib, 3 - Header Stripping";
            return newElm;
        case ContentCompSettings:
            newElm = new BinaryElement(reader);
            newElm.id = 0x4255;
            newElm.name = "ContentCompSettings";
            newElm.level = 6;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "Settings that might be needed by the decompressor. For Header Stripping (ContentCompAlgo=3), the bytes that were removed from the beggining of each frames of the track.";
            return newElm;
        case ContentCompression:
            newElm = new MasterElement();
            newElm.id = 0x5034;
            newElm.name = "ContentCompression";
            newElm.level = 5;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "Settings describing the compression used. Must be present if the value of ContentEncodingType is 0 and absent otherwise. Each block must be decompressable even if no previous block is available in order not to prevent seeking.";
            return newElm;
        case ContentEncAlgo:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x47e1;
            newElm.name = "ContentEncAlgo";
            newElm.level = 6;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.defaultValue = 0;
            // "br": "", description = "The encryption algorithm used. The value '0' means
            // // that the contents have not been encrypted but only signed. Predefined
            // values: // 1 - DES, 2 - 3DES, 3 - Twofish, 4 - Blowfish, 5 - AES";
            return newElm;
        case ContentEncKeyID:
            newElm = new BinaryElement(reader);
            newElm.id = 0x47e2;
            newElm.name = "ContentEncKeyID";
            newElm.level = 6;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "For public key algorithms this is the ID of the public key the the data was encrypted with.";
            return newElm;
        case ContentEncoding:
            newElm = new MasterElement();
            newElm.id = 0x6240;
            newElm.name = "ContentEncoding";
            newElm.level = 4;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Settings for one content encoding like compression or encryption.";
            return newElm;
        case ContentEncodingOrder:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x5031;
            newElm.name = "ContentEncodingOrder";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "Tells when this modification was used during encoding/muxing starting with 0 and counting upwards. The decoder/demuxer has to start with the highest order number it finds and work its way down. This value has to be unique over all ContentEncodingOrder elements in the segment.";
            return newElm;
        case ContentEncodingScope:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x5032;
            newElm.name = "ContentEncodingScope";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 1;
            newElm.range = v -> v != 0;
            // "br": [ "", "", "" ], description = "A bit field that describes which //
            // elements have been modified in this way. Values (big endian) can be OR'ed. //
            // Possible values: 1 - all frame contents, 2 - the track's private data, 4 - //
            // the next ContentEncoding (next ContentEncodingOrder. Either the data inside
            // // ContentCompression and/or ContentEncryption)";
            return newElm;
        case ContentEncodingType:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x5033;
            newElm.name = "ContentEncodingType";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            // "br": [ "", "" ], description = "A value describing what kind of //
            // transformation has been done. Possible values: 0 - compression, 1 - //
            // encryption";
            return newElm;
        case ContentEncodings:
            newElm = new MasterElement();
            newElm.id = 0x6d80;
            newElm.name = "ContentEncodings";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "Settings for several content encoding mechanisms like compression or encryption.";
            return newElm;
        case ContentEncryption:
            newElm = new MasterElement();
            newElm.id = 0x5035;
            newElm.name = "ContentEncryption";
            newElm.level = 5;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "Settings describing the encryption used. Must be present if the value of ContentEncodingType is 1 and absent otherwise.";
            return newElm;
        case ContentSigAlgo:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x47e5;
            newElm.name = "ContentSigAlgo";
            newElm.level = 6;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.defaultValue = 0;
            // "br": "", description = "The algorithm used for the signature. A value of '0'
            // // means that the contents have not been signed but only encrypted.
            // Predefined // values: 1 - RSA";
            return newElm;
        case ContentSigHashAlgo:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x47e6;
            newElm.name = "ContentSigHashAlgo";
            newElm.level = 6;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.defaultValue = 0;
            // "br": [ "", "" ], description = "The hash algorithm used for the signature. A
            // // value of '0' means that the contents have not been signed but only
            // encrypted. // Predefined values: 1 - SHA1-160 2 - MD5";
            return newElm;
        case ContentSigKeyID:
            newElm = new BinaryElement(reader);
            newElm.id = 0x47e4;
            newElm.name = "ContentSigKeyID";
            newElm.level = 6;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "This is the ID of the private key the data was signed with.";
            return newElm;
        case ContentSignature:
            newElm = new BinaryElement(reader);
            newElm.id = 0x47e3;
            newElm.name = "ContentSignature";
            newElm.level = 6;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "A cryptographic signature of the contents.";
            return newElm;
        case CueBlockNumber:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x5378;
            newElm.name = "CueBlockNumber";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 1;
            newElm.range = v -> v != 0;
            newElm.description = "Number of the Block in the specified Cluster.";
            return newElm;
        case CueClusterPosition:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xf1;
            newElm.name = "CueClusterPosition";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.description = "The position of the Cluster containing the required Block.";
            return newElm;
        case CueCodecState:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xea;
            newElm.name = "CueCodecState";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "The position of the Codec State corresponding to this Cue element. 0 means that the data is taken from the initial Track Entry.";
            return newElm;
        case CueDuration:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xb2;
            newElm.name = "CueDuration";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = false;
            newElm.webm = false;
            newElm.description = "The duration of the block according to the segment time base. If missing the track's DefaultDuration does not apply and no duration information is available in terms of the cues.";
            return newElm;
        case CuePoint:
            newElm = new MasterElement();
            newElm.id = 0xbb;
            newElm.name = "CuePoint";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.description = "Contains all information relative to a seek point in the segment.";
            return newElm;
        case CueRefCluster:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x97;
            newElm.name = "CueRefCluster";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "The Position of the Cluster containing the referenced Block.";
            return newElm;
        case CueRefCodecState:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xeb;
            newElm.name = "CueRefCodecState";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "The position of the Codec State corresponding to this referenced element. 0 means that the data is taken from the initial Track Entry.";
            return newElm;
        case CueRefNumber:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x535f;
            newElm.name = "CueRefNumber";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.defaultValue = 1;
            newElm.range = v -> v != 0;
            newElm.description = "Number of the referenced Block of Track X in the specified Cluster.";
            return newElm;
        case CueRefTime:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x96;
            newElm.name = "CueRefTime";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "Timestamp of the referenced Block.";
            return newElm;
        case CueReference:
            newElm = new MasterElement();
            newElm.id = 0xdb;
            newElm.name = "CueReference";
            newElm.level = 4;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "The Clusters containing the required referenced Blocks.";
            return newElm;
        case CueRelativePosition:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xf0;
            newElm.name = "CueRelativePosition";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = false;
            newElm.webm = false;
            newElm.description = "The relative position of the referenced block inside the cluster with 0 being the first possible position for an element inside that cluster.";
            return newElm;
        case CueTime:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xb3;
            newElm.name = "CueTime";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.description = "Absolute timestamp according to the segment time base.";
            return newElm;
        case CueTrack:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xf7;
            newElm.name = "CueTrack";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.range = v -> v != 0;
            newElm.description = "The track for which a position is given.";
            return newElm;
        case CueTrackPositions:
            newElm = new MasterElement();
            newElm.id = 0xb7;
            newElm.name = "CueTrackPositions";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.description = "Contain positions for different tracks corresponding to the timestamp.";
            return newElm;
        case Cues:
            newElm = new MasterElement();
            newElm.id = 0x1c53bb6b;
            newElm.name = "Cues";
            newElm.level = 1;
            newElm.type = Type.Master;
            newElm.description = "A top-level element to speed seeking access. All entries are local to the segment. Should be mandatory for non \"live\" streams.";
            return newElm;
        case DateUTC:
            newElm = new DateElement(reader);
            newElm.id = 0x4461;
            newElm.name = "DateUTC";
            newElm.level = 2;
            newElm.type = Type.Date;
            newElm.description = "Date of the origin of timestamp (value 0), i.e. production date.";
            return newElm;
        case DefaultDecodedFieldDuration:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x234e7a;
            newElm.name = "DefaultDecodedFieldDuration";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.range = v -> v != 0;
            newElm.description = "The period in nanoseconds (not scaled by TimcodeScale)\nbetween two successive fields at the output of the decoding process (see the notes)";
            return newElm;
        case DefaultDuration:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x23e383;
            newElm.name = "DefaultDuration";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.range = v -> v != 0;
            newElm.description = "Number of nanoseconds (not scaled via TimecodeScale) per frame ('frame' in the Matroska sense -- one element put into a (Simple)Block).";
            return newElm;
        case Delay:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xce;
            newElm.name = "Delay";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "The (scaled) delay to apply to the element.";
            return newElm;
        case DiscardPadding:
            newElm = new SignedIntegerElement(reader);
            newElm.id = 0x75a2;
            newElm.name = "DiscardPadding";
            newElm.level = 3;
            newElm.type = Type.SignedInt;
            newElm.webm = true;
            newElm.description = "Duration in nanoseconds of the silent data added to the Block (padding at the end of the Block for positive value, at the beginning of the Block for negative value). The duration of DiscardPadding is not calculated in the duration of the TrackEntry and should be discarded during playback.";
            return newElm;
        case DisplayHeight:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x54ba;
            newElm.name = "DisplayHeight";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = "PixelHeight";
            newElm.range = v -> v != 0;
            newElm.description = "Height of the video frames to display. The default value is only valid when DisplayUnit is 0.";
            return newElm;
        case DisplayUnit:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x54b2;
            newElm.name = "DisplayUnit";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "How DisplayWidth & DisplayHeight should be interpreted (0: pixels, 1: centimeters, 2: inches, 3: Display Aspect Ratio).";
            return newElm;
        case DisplayWidth:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x54b0;
            newElm.name = "DisplayWidth";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = "PixelWidth";
            newElm.range = v -> v != 0;
            newElm.description = "Width of the video frames to display. The default value is only valid when DisplayUnit is 0.";
            return newElm;
        case DocType:
            newElm = new StringElement(reader);
            newElm.id = 0x4282;
            newElm.name = "DocType";
            newElm.level = 1;
            newElm.type = Type.Ascii;
            newElm.mandatory = true;
            newElm.defaultValue = "matroska";
            newElm.description = "A string that describes the type of document that follows this EBML header. 'matroska' in our case or 'webm' for webm files.";
            return newElm;
        case DocTypeReadVersion:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x4285;
            newElm.name = "DocTypeReadVersion";
            newElm.level = 1;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 1;
            newElm.description = "The minimum DocType version an interpreter has to support to read this file.";
            return newElm;
        case DocTypeVersion:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x4287;
            newElm.name = "DocTypeVersion";
            newElm.level = 1;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 1;
            newElm.description = "The version of DocType interpreter used to create the file.";
            return newElm;
        case Duration:
            newElm = new FloatElement(reader);
            newElm.id = 0x4489;
            newElm.name = "Duration";
            newElm.level = 2;
            newElm.type = Type.Float;
            newElm.range = v -> v > 0;
            newElm.description = "Duration of the segment (based on TimecodeScale).";
            return newElm;
        case EBML:
            newElm = new MasterElement();
            newElm.id = 0x1a45dfa3;
            newElm.name = "EBML";
            newElm.level = 0;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.description = "Set the EBML characteristics of the data to follow. Each EBML document has to start with this.";
            return newElm;
        case EBMLMaxIDLength:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x42f2;
            newElm.name = "EBMLMaxIDLength";
            newElm.level = 1;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 4;
            newElm.description = "The maximum length of the IDs you'll find in this file (4 or less in Matroska).";
            return newElm;
        case EBMLMaxSizeLength:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x42f3;
            newElm.name = "EBMLMaxSizeLength";
            newElm.level = 1;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 8;
            newElm.description = "The maximum length of the sizes you'll find in this file (8 or less in Matroska). This does not override the element size indicated at the beginning of an element. Elements that have an indicated size which is larger than what is allowed by EBMLMaxSizeLength shall be considered invalid.";
            return newElm;
        case EBMLReadVersion:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x42f7;
            newElm.name = "EBMLReadVersion";
            newElm.level = 1;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 1;
            newElm.description = "The minimum EBML version a parser has to support to read this file.";
            return newElm;
        case EBMLVersion:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x4286;
            newElm.name = "EBMLVersion";
            newElm.level = 1;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 1;
            newElm.description = "The version of EBML parser used to create the file.";
            return newElm;
        case EditionEntry:
            newElm = new MasterElement();
            newElm.id = 0x45b9;
            newElm.name = "EditionEntry";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = true;
            newElm.description = "Contains all information about a segment edition.";
            return newElm;
        case EditionFlagDefault:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x45db;
            newElm.name = "EditionFlagDefault";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "If a flag is set (1) the edition should be used as the default one. (1 bit)";
            return newElm;
        case EditionFlagHidden:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x45bd;
            newElm.name = "EditionFlagHidden";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "If an edition is hidden (1), it should not be available to the user interface (but still to Control Tracks; see flag notes). (1 bit)";
            return newElm;
        case EditionFlagOrdered:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x45dd;
            newElm.name = "EditionFlagOrdered";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "Specify if the chapters can be defined multiple times and the order to play them is enforced. (1 bit)";
            return newElm;
        case EditionUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x45bc;
            newElm.name = "EditionUID";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.range = v -> v != 0;
            newElm.description = "A unique ID to identify the edition. It's useful for tagging an edition.";
            return newElm;
        case EncryptedBlock:
            newElm = new BinaryElement(reader);
            newElm.id = 0xaf;
            newElm.name = "EncryptedBlock";
            newElm.level = 2;
            newElm.type = Type.Binary;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Similar to EncryptedBlock Structure)";
            return newElm;
        case FileData:
            newElm = new BinaryElement(reader);
            newElm.id = 0x465c;
            newElm.name = "FileData";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "The data of the file.";
            return newElm;
        case FileDescription:
            newElm = new StringElement(reader);
            newElm.id = 0x467e;
            newElm.name = "FileDescription";
            newElm.level = 3;
            newElm.type = Type.Utf8;
            newElm.webm = false;
            newElm.description = "A human-friendly name for the attached file.";
            return newElm;
        case FileMimeType:
            newElm = new StringElement(reader);
            newElm.id = 0x4660;
            newElm.name = "FileMimeType";
            newElm.level = 3;
            newElm.type = Type.Ascii;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "MIME type of the file.";
            return newElm;
        case FileName:
            newElm = new StringElement(reader);
            newElm.id = 0x466e;
            newElm.name = "FileName";
            newElm.level = 3;
            newElm.type = Type.Utf8;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "Filename of the attached file.";
            return newElm;
        case FileReferral:
            newElm = new BinaryElement(reader);
            newElm.id = 0x4675;
            newElm.name = "FileReferral";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "A binary value that a track/codec can refer to when the attachment is needed.";
            return newElm;
        case FileUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x46ae;
            newElm.name = "FileUID";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.range = v -> v != 0;
            newElm.description = "Unique ID representing the file, as random as possible.";
            return newElm;
        case FileUsedEndTime:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x4662;
            newElm.name = "FileUsedEndTime";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.description = "DivX font extension";
            return newElm;
        case FileUsedStartTime:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x4661;
            newElm.name = "FileUsedStartTime";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.description = "DivX font extension";
            return newElm;
        case FlagDefault:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x88;
            newElm.name = "FlagDefault";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 1;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "Set if that track (audio, video or subs) SHOULD be active if no language found matches the user preference. (1 bit)";
            return newElm;
        case FlagEnabled:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xb9;
            newElm.name = "FlagEnabled";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = true;
            newElm.defaultValue = 1;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "Set if the track is usable. (1 bit)";
            return newElm;
        case FlagForced:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x55aa;
            newElm.name = "FlagForced";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 0;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "Set if that track MUST be active during playback. There can be many forced track for a kind (audio, video or subs), the player should select the one which language matches the user preference or the default + forced track. Overlay MAY happen between a forced and non-forced track of the same kind. (1 bit)";
            return newElm;
        case FlagInterlaced:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x9a;
            newElm.name = "FlagInterlaced";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = true;
            newElm.defaultValue = 0;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "Set if the video is interlaced. (1 bit)";
            return newElm;
        case FlagLacing:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x9c;
            newElm.name = "FlagLacing";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = 1;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "Set if the track may contain blocks using lacing. (1 bit)";
            return newElm;
        case FrameNumber:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xcd;
            newElm.name = "FrameNumber";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "The number of the frame to generate from this lace with this delay (allow you to generate many frames from the same Block/Frame).";
            return newElm;
        case FrameRate:
            newElm = new FloatElement(reader);
            newElm.id = 0x2383e3;
            newElm.name = "FrameRate";
            newElm.level = 4;
            newElm.type = Type.Float;
            newElm.range = v -> v > 0;
            newElm.description = "Number of frames per second.  only.";
            return newElm;
        case GammaValue:
            newElm = new FloatElement(reader);
            newElm.id = 0x2fb523;
            newElm.name = "GammaValue";
            newElm.level = 4;
            newElm.type = Type.Float;
            newElm.webm = false;
            newElm.range = v -> v > 0;
            newElm.description = "Gamma Value.";
            return newElm;
        case Info:
            newElm = new MasterElement();
            newElm.id = 0x1549a966;
            newElm.name = "Info";
            newElm.level = 1;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.description = "Contains miscellaneous general information and statistics on the file.";
            return newElm;
        case LaceNumber:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xcc;
            newElm.name = "LaceNumber";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "The reverse number of the frame in the lace (0 is the last frame, 1 is the next to last, etc). While there are a few files in the wild with this element, it is no longer in use and has been deprecated. Being able to interpret this element is not required for playback.";
            return newElm;
        case Language:
            newElm = new StringElement(reader);
            newElm.id = 0x22b59c;
            newElm.name = "Language";
            newElm.level = 3;
            newElm.type = Type.Ascii;
            newElm.defaultValue = "eng";
            newElm.description = "Specifies the language of the track in the Matroska languages form.";
            return newElm;
        case MaxBlockAdditionID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x55ee;
            newElm.name = "MaxBlockAdditionID";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "The maximum value of BlockAdditions for this track.";
            return newElm;
        case MaxCache:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x6df8;
            newElm.name = "MaxCache";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.description = "The maximum cache size required to store referenced frames in and the current frame. 0 means no cache is needed.";
            return newElm;
        case MinCache:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x6de7;
            newElm.name = "MinCache";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "The minimum number of frames a player should be able to cache during playback. If set to 0, the reference pseudo-cache system is not used.";
            return newElm;
        case MuxingApp:
            newElm = new StringElement(reader);
            newElm.id = 0x4d80;
            newElm.name = "MuxingApp";
            newElm.level = 2;
            newElm.type = Type.Utf8;
            newElm.mandatory = true;
            newElm.description = "Muxing application or library (\"libmatroska-0.4.3\").";
            return newElm;
        case Name:
            newElm = new StringElement(reader);
            newElm.id = 0x536e;
            newElm.name = "Name";
            newElm.level = 3;
            newElm.type = Type.Utf8;
            newElm.description = "A human-readable track name.";
            return newElm;
        case NextFilename:
            newElm = new StringElement(reader);
            newElm.id = 0x3e83bb;
            newElm.name = "NextFilename";
            newElm.level = 2;
            newElm.type = Type.Utf8;
            newElm.webm = false;
            newElm.description = "An escaped filename corresponding to the next segment.";
            return newElm;
        case NextUID:
            newElm = new BinaryElement(reader);
            newElm.id = 0x3eb923;
            newElm.name = "NextUID";
            newElm.level = 2;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "A unique ID to identify the next chained segment (128 bits).";
            return newElm;
        case OldStereoMode:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x53b9;
            newElm.name = "OldStereoMode";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.description = "DEPRECATED, DO NOT USE. Bogus StereoMode value used in old versions of libmatroska. (0: mono, 1: right eye, 2: left eye, 3: both eyes).";
            return newElm;
        case OutputSamplingFrequency:
            newElm = new FloatElement(reader);
            newElm.id = 0x78b5;
            newElm.name = "OutputSamplingFrequency";
            newElm.level = 4;
            newElm.type = Type.Float;
            newElm.defaultValue = "Sampling Frequency";
            newElm.range = v -> v > 0;
            newElm.description = "Real output sampling frequency in Hz (used for SBR techniques).";
            return newElm;
        case PixelCropBottom:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x54aa;
            newElm.name = "PixelCropBottom";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "The number of video pixels to remove at the bottom of the image (for HDTV content).";
            return newElm;
        case PixelCropLeft:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x54cc;
            newElm.name = "PixelCropLeft";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "The number of video pixels to remove on the left of the image.";
            return newElm;
        case PixelCropRight:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x54dd;
            newElm.name = "PixelCropRight";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "The number of video pixels to remove on the right of the image.";
            return newElm;
        case PixelCropTop:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x54bb;
            newElm.name = "PixelCropTop";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "The number of video pixels to remove at the top of the image.";
            return newElm;
        case PixelHeight:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xba;
            newElm.name = "PixelHeight";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.range = v -> v != 0;
            newElm.description = "Height of the encoded video frames in pixels.";
            return newElm;
        case PixelWidth:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xb0;
            newElm.name = "PixelWidth";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.range = v -> v != 0;
            newElm.description = "Width of the encoded video frames in pixels.";
            return newElm;
        case Position:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xa7;
            newElm.name = "Position";
            newElm.level = 2;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.description = "The Position of the Cluster in the segment (0 in live broadcast streams). It might help to resynchronise offset on damaged streams.";
            return newElm;
        case PrevFilename:
            newElm = new StringElement(reader);
            newElm.id = 0x3c83ab;
            newElm.name = "PrevFilename";
            newElm.level = 2;
            newElm.type = Type.Utf8;
            newElm.webm = false;
            newElm.description = "An escaped filename corresponding to the previous segment.";
            return newElm;
        case PrevSize:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xab;
            newElm.name = "PrevSize";
            newElm.level = 2;
            newElm.type = Type.UnsignedInt;
            newElm.description = "Size of the previous Cluster, in octets. Can be useful for backward playing.";
            return newElm;
        case PrevUID:
            newElm = new BinaryElement(reader);
            newElm.id = 0x3cb923;
            newElm.name = "PrevUID";
            newElm.level = 2;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "A unique ID to identify the previous chained segment (128 bits).";
            return newElm;
        case ReferenceBlock:
            newElm = new SignedIntegerElement(reader);
            newElm.id = 0xfb;
            newElm.name = "ReferenceBlock";
            newElm.level = 3;
            newElm.type = Type.SignedInt;
            newElm.multiple = true;
            newElm.description = "Timestamp of another frame used as a reference (ie: B or P frame). The timestamp is relative to the block it's attached to.";
            return newElm;
        case ReferenceFrame:
            newElm = new MasterElement();
            newElm.id = 0xc8;
            newElm.name = "ReferenceFrame";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.multiple = false;
            newElm.webm = false;
            newElm.description = "DivX trick track extenstions";
            return newElm;
        case ReferenceOffset:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xc9;
            newElm.name = "ReferenceOffset";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = false;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "DivX trick track extenstions";
            return newElm;
        case ReferencePriority:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xfa;
            newElm.name = "ReferencePriority";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "This frame is referenced and has the specified cache priority. In cache only a frame of the same or higher priority can replace this frame. A value of 0 means the frame is not referenced.";
            return newElm;
        case ReferenceTimeCode:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xca;
            newElm.name = "ReferenceTimeCode";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = false;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "DivX trick track extenstions";
            return newElm;
        case ReferenceVirtual:
            newElm = new SignedIntegerElement(reader);
            newElm.id = 0xfd;
            newElm.name = "ReferenceVirtual";
            newElm.level = 3;
            newElm.type = Type.SignedInt;
            newElm.webm = false;
            newElm.description = "Relative position of the data that should be in position of the virtual block.";
            return newElm;
        case SamplingFrequency:
            newElm = new FloatElement(reader);
            newElm.id = 0xb5;
            newElm.name = "SamplingFrequency";
            newElm.level = 4;
            newElm.type = Type.Float;
            newElm.mandatory = true;
            newElm.defaultValue = 8000.0;
            newElm.range = v -> v > 0;
            newElm.description = "Sampling frequency in Hz.";
            return newElm;
        case Seek:
            newElm = new MasterElement();
            newElm.id = 0x4dbb;
            newElm.name = "Seek";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.description = "Contains a single seek entry to an EBML element.";
            return newElm;
        case SeekHead:
            newElm = new MasterElement();
            newElm.id = 0x114d9b74;
            newElm.name = "SeekHead";
            newElm.level = 1;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.description = "Contains the position of other level 1 elements.";
            return newElm;
        case SeekID:
            newElm = new BinaryElement(reader);
            newElm.id = 0x53ab;
            newElm.name = "SeekID";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.mandatory = true;
            newElm.description = "The binary ID corresponding to the element name.";
            return newElm;
        case SeekPosition:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x53ac;
            newElm.name = "SeekPosition";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.description = "The position of the element in the segment in octets (0 = first level 1 element).";
            return newElm;
        case SeekPreRoll:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x56bb;
            newElm.name = "SeekPreRoll";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.multiple = false;
            newElm.defaultValue = 0;
            newElm.webm = true;
            newElm.description = "After a discontinuity, SeekPreRoll is the duration in nanoseconds of the data the decoder must decode before the decoded data is valid.";
            return newElm;
        case Segment:
            newElm = new MasterElement();
            newElm.id = 0x18538067;
            newElm.name = "Segment";
            newElm.level = 0;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.description = "This element contains all other top-level (level 1) elements. Typically a Matroska file is composed of 1 segment.";
            return newElm;
        case SegmentFamily:
            newElm = new BinaryElement(reader);
            newElm.id = 0x4444;
            newElm.name = "SegmentFamily";
            newElm.level = 2;
            newElm.type = Type.Binary;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "A randomly generated unique ID that all segments related to each other must use (128 bits).";
            return newElm;
        case SegmentFilename:
            newElm = new StringElement(reader);
            newElm.id = 0x7384;
            newElm.name = "SegmentFilename";
            newElm.level = 2;
            newElm.type = Type.Utf8;
            newElm.webm = false;
            newElm.description = "A filename corresponding to this segment.";
            return newElm;
        case SegmentUID:
            newElm = new BinaryElement(reader);
            newElm.id = 0x73a4;
            newElm.name = "SegmentUID";
            newElm.level = 2;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.range = v -> v != 0;
            newElm.description = "A randomly generated unique ID to identify the current segment between many others (128 bits).";
            return newElm;
        case Signature:
            newElm = new BinaryElement(reader);
            newElm.id = 0x7eb5;
            newElm.name = "Signature";
            newElm.level = 1;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "The signature of the data (until a new.";
            return newElm;
        case SignatureAlgo:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x7e8a;
            newElm.name = "SignatureAlgo";
            newElm.level = 1;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.description = "Signature algorithm used (1=RSA, 2=elliptic).";
            return newElm;
        case SignatureElementList:
            newElm = new MasterElement();
            newElm.id = 0x7e7b;
            newElm.name = "SignatureElementList";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "A list consists of a number of consecutive elements that represent one case where data is used in signature. Ex:  means that the BlockAdditional of all Blocks in all Clusters is used for encryption.";
            return newElm;
        case SignatureElements:
            newElm = new MasterElement();
            newElm.id = 0x7e5b;
            newElm.name = "SignatureElements";
            newElm.level = 1;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "Contains elements that will be used to compute the signature.";
            return newElm;
        case SignatureHash:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x7e9a;
            newElm.name = "SignatureHash";
            newElm.level = 1;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.description = "Hash algorithm used (1=SHA1-160, 2=MD5).";
            return newElm;
        case SignaturePublicKey:
            newElm = new BinaryElement(reader);
            newElm.id = 0x7ea5;
            newElm.name = "SignaturePublicKey";
            newElm.level = 1;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "The public key to use with the algorithm (in the case of a PKI-based signature).";
            return newElm;
        case SignatureSlot:
            newElm = new MasterElement();
            newElm.id = 0x1b538667;
            newElm.name = "SignatureSlot";
            newElm.level = -1;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Contain signature of some (coming) elements in the stream.";
            return newElm;
        case SignedElement:
            newElm = new BinaryElement(reader);
            newElm.id = 0x6532;
            newElm.name = "SignedElement";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "An element ID whose data will be used to compute the signature.";
            return newElm;
        case SilentTrackNumber:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x58d7;
            newElm.name = "SilentTrackNumber";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "One of the track number that are not used from now on in the stream. It could change later if not specified as silent in a further Cluster.";
            return newElm;
        case SilentTracks:
            newElm = new MasterElement();
            newElm.id = 0x5854;
            newElm.name = "SilentTracks";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "The list of tracks that are not used in that part of the stream. It is useful when using overlay tracks on seeking. Then you should decide what track to use.";
            return newElm;
        case SimpleBlock:
            newElm = new BlockElement(reader);
            newElm.id = 0xa3;
            newElm.name = "SimpleBlock";
            newElm.level = 2;
            newElm.type = Type.Binary;
            newElm.multiple = true;
            newElm.webm = true;
            newElm.description = "Similar to SimpleBlock Structure";
            return newElm;
        case SimpleTag:
            newElm = new MasterElement();
            newElm.id = 0x67c8;
            newElm.name = "SimpleTag";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Contains general information about the target.";
            return newElm;
        case SliceDuration:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xcf;
            newElm.name = "SliceDuration";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "The (scaled) duration to apply to the element.";
            return newElm;
        case Slices:
            newElm = new MasterElement();
            newElm.id = 0x8e;
            newElm.name = "Slices";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.description = "Contains slices description.";
            return newElm;
        case StereoMode:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x53b8;
            newElm.name = "StereoMode";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.webm = true;
            newElm.defaultValue = 0;
            newElm.description = "Stereo-3D video mode (0: mono, 1: side by side (left eye is first), 2: top-bottom (right eye is first), 3: top-bottom (left eye is first), 4: checkboard (right is first), 5: checkboard (left is first), 6: row interleaved (right is first), 7: row interleaved (left is first), 8: column interleaved (right is first), 9: column interleaved (left is first), 10: anaglyph (cyan/red), 11: side by side (right eye is first), 12: anaglyph (green/magenta), 13 both eyes laced in one Block (left eye is first), 14 both eyes laced in one Block (right eye is first)) . There are some more details on 3D support in the Specification Notes.";
            return newElm;
        case Tag:
            newElm = new MasterElement();
            newElm.id = 0x7373;
            newElm.name = "Tag";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Element containing elements specific to Tracks/Chapters.";
            return newElm;
        case TagAttachmentUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x63c6;
            newElm.name = "TagAttachmentUID";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "A unique ID to identify the Attachment(s) the tags belong to. If the value is 0 at this level, the tags apply to all the attachments in the Segment.";
            return newElm;
        case TagBinary:
            newElm = new BinaryElement(reader);
            newElm.id = 0x4485;
            newElm.name = "TagBinary";
            newElm.level = 4;
            newElm.type = Type.Binary;
            newElm.webm = false;
            newElm.description = "The values of the Tag if it is binary. Note that this cannot be used in the same SimpleTag as TagString.";
            return newElm;
        case TagChapterUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x63c4;
            newElm.name = "TagChapterUID";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "A unique ID to identify the Chapter(s) the tags belong to. If the value is 0 at this level, the tags apply to all chapters in the Segment.";
            return newElm;
        case TagDefault:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x4484;
            newElm.name = "TagDefault";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 1;
            newElm.range = v -> 0 <= v && v <= 1;
            newElm.description = "Indication to know if this is the default/original language to use for the given tag. (1 bit)";
            return newElm;
        case TagEditionUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x63c9;
            newElm.name = "TagEditionUID";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "A unique ID to identify the EditionEntry(s) the tags belong to. If the value is 0 at this level, the tags apply to all editions in the Segment.";
            return newElm;
        case TagLanguage:
            newElm = new StringElement(reader);
            newElm.id = 0x447a;
            newElm.name = "TagLanguage";
            newElm.level = 4;
            newElm.type = Type.Ascii;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = "und";
            newElm.description = "Specifies the language of the tag specified, in the Matroska languages form.";
            return newElm;
        case TagName:
            newElm = new StringElement(reader);
            newElm.id = 0x45a3;
            newElm.name = "TagName";
            newElm.level = 4;
            newElm.type = Type.Utf8;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "The name of the Tag that is going to be stored.";
            return newElm;
        case TagString:
            newElm = new StringElement(reader);
            newElm.id = 0x4487;
            newElm.name = "TagString";
            newElm.level = 4;
            newElm.type = Type.Utf8;
            newElm.webm = false;
            newElm.description = "The value of the Element.";
            return newElm;
        case TagTrackUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x63c5;
            newElm.name = "TagTrackUID";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "A unique ID to identify the Track(s) the tags belong to. If the value is 0 at this level, the tags apply to all tracks in the Segment.";
            return newElm;
        case Tags:
            newElm = new MasterElement();
            newElm.id = 0x1254c367;
            newElm.name = "Tags";
            newElm.level = 1;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Element containing elements specific to Tracks/Chapters. A list of valid tags can be found here.";
            return newElm;
        case TargetType:
            newElm = new StringElement(reader);
            newElm.id = 0x63ca;
            newElm.name = "TargetType";
            newElm.level = 4;
            newElm.type = Type.Ascii;
            newElm.webm = false;
            newElm.description = "An  string that can be used to display the logical level of the target like \"ALBUM\", \"TRACK\", \"MOVIE\", \"CHAPTER\", etc (see TargetType).";
            return newElm;
        case TargetTypeValue:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x68ca;
            newElm.name = "TargetTypeValue";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.webm = false;
            newElm.defaultValue = 50;
            newElm.description = "A number to indicate the logical level of the target (see TargetType).";
            return newElm;
        case Targets:
            newElm = new MasterElement();
            newElm.id = 0x63c0;
            newElm.name = "Targets";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "Contain all UIDs where the specified meta data apply. It is empty to describe everything in the segment.";
            return newElm;
        case TimeSlice:
            newElm = new MasterElement();
            newElm.id = 0xe8;
            newElm.name = "TimeSlice";
            newElm.level = 4;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.description = "Contains extra time information about the data contained in the Block. While there are a few files in the wild with this element, it is no longer in use and has been deprecated. Being able to interpret this element is not required for playback.";
            return newElm;
        case Timecode:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xe7;
            newElm.name = "Timecode";
            newElm.level = 2;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.description = "Absolute timestamp of the cluster (based on TimecodeScale).";
            return newElm;
        case TimecodeScale:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x2ad7b1;
            newElm.name = "TimecodeScale";
            newElm.level = 2;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = "1000000";
            newElm.description = "Timestamp scale in nanoseconds (1.000.000 means all timestamps in the segment are expressed in milliseconds).";
            return newElm;
        case TimecodeScaleDenominator:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x2ad7b2;
            newElm.name = "TimecodeScaleDenominator";
            newElm.level = 2;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.defaultValue = "1000000000";
            newElm.description = "Timestamp scale numerator, see TimecodeScale.";
            return newElm;
        case Title:
            newElm = new StringElement(reader);
            newElm.id = 0x7ba9;
            newElm.name = "Title";
            newElm.level = 2;
            newElm.type = Type.Utf8;
            newElm.webm = false;
            newElm.description = "General name of the segment.";
            return newElm;
        case TrackCombinePlanes:
            newElm = new MasterElement();
            newElm.id = 0xe3;
            newElm.name = "TrackCombinePlanes";
            newElm.level = 4;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "Contains the list of all video plane tracks that need to be combined to create this 3D track";
            return newElm;
        case TrackEntry:
            newElm = new MasterElement();
            newElm.id = 0xae;
            newElm.name = "TrackEntry";
            newElm.level = 2;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.description = "Describes a track with all elements.";
            return newElm;
        case TrackJoinBlocks:
            newElm = new MasterElement();
            newElm.id = 0xe9;
            newElm.name = "TrackJoinBlocks";
            newElm.level = 4;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "Contains the list of all tracks whose Blocks need to be combined to create this virtual track";
            return newElm;
        case TrackJoinUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xed;
            newElm.name = "TrackJoinUID";
            newElm.level = 5;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.range = v -> v != 0;
            newElm.description = "The trackUID number of a track whose blocks are used to create this virtual track.";
            return newElm;
        case TrackNumber:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xd7;
            newElm.name = "TrackNumber";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.range = v -> v != 0;
            newElm.description = "The track number as used in the Block Header (using more than 127 tracks is not encouraged, though the design allows an unlimited number).";
            return newElm;
        case TrackOffset:
            newElm = new SignedIntegerElement(reader);
            newElm.id = 0x537f;
            newElm.name = "TrackOffset";
            newElm.level = 3;
            newElm.type = Type.SignedInt;
            newElm.webm = false;
            newElm.defaultValue = 0;
            newElm.description = "A value to add to the Block's Timestamp. This can be used to adjust the playback offset of a track.";
            return newElm;
        case TrackOperation:
            newElm = new MasterElement();
            newElm.id = 0xe2;
            newElm.name = "TrackOperation";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.webm = false;
            newElm.description = "Operation that needs to be applied on tracks to create this virtual track. For more details look at the Specification Notes on the subject.";
            return newElm;
        case TrackOverlay:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x6fab;
            newElm.name = "TrackOverlay";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Specify that this track is an overlay track for the Track specified (in the u-integer). That means when this track has a gap (see SilentTracks) the overlay track should be used instead. The order of multiple TrackOverlay matters, the first one is the one that should be used. If not found it should be the second, etc.";
            return newElm;
        case TrackPlane:
            newElm = new MasterElement();
            newElm.id = 0xe4;
            newElm.name = "TrackPlane";
            newElm.level = 5;
            newElm.type = Type.Master;
            newElm.mandatory = true;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Contains a video plane track that need to be combined to create this 3D track";
            return newElm;
        case TrackPlaneType:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xe6;
            newElm.name = "TrackPlaneType";
            newElm.level = 6;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "The kind of plane this track corresponds to (0: left eye, 1: right eye, 2: background).";
            return newElm;
        case TrackPlaneUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xe5;
            newElm.name = "TrackPlaneUID";
            newElm.level = 6;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.range = v -> v != 0;
            newElm.description = "The trackUID number of the track representing the plane.";
            return newElm;
        case TrackTimecodeScale:
            newElm = new FloatElement(reader);
            newElm.id = 0x23314f;
            newElm.name = "TrackTimecodeScale";
            newElm.level = 3;
            newElm.type = Type.Float;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.defaultValue = 1.0;
            newElm.range = v -> v > 0;
            newElm.description = "DEPRECATED, DO NOT USE. The scale to apply on this track to work at normal speed in relation with other tracks (mostly used to adjust video speed when the audio length differs).";
            return newElm;
        case TrackTranslate:
            newElm = new MasterElement();
            newElm.id = 0x6624;
            newElm.name = "TrackTranslate";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "The track identification for the given Chapter Codec.";
            return newElm;
        case TrackTranslateCodec:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x66bf;
            newElm.name = "TrackTranslateCodec";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "The chapter codec using this ID (0: Matroska Script, 1: DVD-menu).";
            return newElm;
        case TrackTranslateEditionUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x66fc;
            newElm.name = "TrackTranslateEditionUID";
            newElm.level = 4;
            newElm.type = Type.UnsignedInt;
            newElm.multiple = true;
            newElm.webm = false;
            newElm.description = "Specify an edition UID on which this translation applies. When not specified, it means for all editions found in the segment.";
            return newElm;
        case TrackTranslateTrackID:
            newElm = new BinaryElement(reader);
            newElm.id = 0x66a5;
            newElm.name = "TrackTranslateTrackID";
            newElm.level = 4;
            newElm.type = Type.Binary;
            newElm.mandatory = true;
            newElm.webm = false;
            newElm.description = "The binary value used to represent this track in the chapter codec data. The format depends on the ChapProcessCodecID used.";
            return newElm;
        case TrackType:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x83;
            newElm.name = "TrackType";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.range = v -> 1 <= v && v <= 254;
            newElm.description = "A set of track types coded on 8 bits (1: video, 2: audio, 3: complex, 0x10: logo, 0x11: subtitle, 0x12: buttons, 0x20: control).";
            return newElm;
        case TrackUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0x73c5;
            newElm.name = "TrackUID";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.mandatory = true;
            newElm.range = v -> v != 0;
            newElm.description = "A unique ID to identify the Track. This should be kept the same when making a direct stream copy of the Track to another file.";
            return newElm;
        case Tracks:
            newElm = new MasterElement();
            newElm.id = 0x1654ae6b;
            newElm.name = "Tracks";
            newElm.level = 1;
            newElm.type = Type.Master;
            newElm.multiple = true;
            newElm.description = "A top-level block of information with many tracks described.";
            return newElm;
        case TrickMasterTrackSegmentUID:
            newElm = new BinaryElement(reader);
            newElm.id = 0xc4;
            newElm.name = "TrickMasterTrackSegmentUID";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.description = "DivX trick track extenstions";
            return newElm;
        case TrickMasterTrackUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xc7;
            newElm.name = "TrickMasterTrackUID";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.description = "DivX trick track extenstions";
            return newElm;
        case TrickTrackFlag:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xc6;
            newElm.name = "TrickTrackFlag";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.defaultValue = 0;
            newElm.description = "DivX trick track extenstions";
            return newElm;
        case TrickTrackSegmentUID:
            newElm = new BinaryElement(reader);
            newElm.id = 0xc1;
            newElm.name = "TrickTrackSegmentUID";
            newElm.level = 3;
            newElm.type = Type.Binary;
            newElm.description = "DivX trick track extenstions";
            return newElm;
        case TrickTrackUID:
            newElm = new UnsignedIntegerElement(reader);
            newElm.id = 0xc0;
            newElm.name = "TrickTrackUID";
            newElm.level = 3;
            newElm.type = Type.UnsignedInt;
            newElm.description = "DivX trick track extenstions";
            return newElm;
        case Video:
            newElm = new MasterElement();
            newElm.id = 0xe0;
            newElm.name = "Video";
            newElm.level = 3;
            newElm.type = Type.Master;
            newElm.description = "Video settings.";
            return newElm;
        case Void:
            newElm = new BinaryElement(reader);
            newElm.id = 0xec;
            newElm.name = "Void";
            newElm.level = -1;
            newElm.type = Type.Binary;
            newElm.description = "Used to void damaged data, to avoid unexpected behaviors when using damaged data. The content is discarded. Also used to reserve space in a sub-element for later use.";
            return newElm;
        case WritingApp:
            newElm = new StringElement(reader);
            newElm.id = 0x5741;
            newElm.name = "WritingApp";
            newElm.level = 2;
            newElm.type = Type.Utf8;
            newElm.mandatory = true;
            newElm.description = "Writing application (\"mkvmerge-0.3.3\").";
            return newElm;
        }
        return null;
    }
}
