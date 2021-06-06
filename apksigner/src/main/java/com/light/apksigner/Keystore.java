package com.light.apksigner;

//These bytes are taken from private key file and template file
public class Keystore{
	public static byte[] privateKey = new byte[]{48, -126, 4, -67, 2, 1, 0, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 4, -126, 4, -89, 48, -126, 4, -93, 2, 1, 0, 2, -126, 1, 1, 0, -42, -109, 25, 4, -34, -58, 11, 36, -79, -19, -57, 98, -32, -39, -40, 37, 62, 62, -51, 108, -21, 29, -30, -1, 6, -116, -88, -24, -68, -88, -51, 107, -45, 120, 110, -89, 10, -89, 108, -26, 14, -69, 15, -103, 53, 89, -1, -39, 62, 119, -87, 67, -25, -24, 61, 75, 100, -72, -28, -2, -94, -45, -26, 86, -15, -30, 103, -88, 27, -65, -78, 48, -75, 120, -62, 4, 67, -66, 76, 114, 24, -72, 70, -11, 33, 21, -122, -16, 56, -95, 78, -119, -62, -66, 56, 127, -114, -66, -49, -113, -54, -61, -38, 30, -29, 48, -55, -22, -109, -48, -89, -61, -36, 74, -13, 80, 34, 13, 80, 8, 7, 50, -32, -128, -105, 23, -18, 106, 5, 51, 89, -26, -90, -108, -20, 44, -77, -14, -124, -96, -92, 102, -56, 122, -108, -40, 59, 49, 9, 58, 103, 55, 46, 47, 100, 18, -64, 110, 109, 66, -15, 88, 24, -33, -2, 3, -127, -52, 12, -44, 68, -38, 108, -35, -61, -72, 36, 88, 25, 72, 1, -77, 37, 100, 19, 79, -65, -34, -104, -55, 40, 119, 72, -37, -11, 103, 106, 84, 13, -127, 84, -56, -69, -54, 7, -71, -30, 71, 85, 51, 17, -60, 107, -102, -9, 111, -34, -20, -52, -114, 105, -25, -56, -94, -48, -114, 120, 38, 32, -108, 63, -103, 114, 125, 60, 4, -2, 114, -103, 29, -103, -33, -101, -82, 56, -96, -78, 23, 127, -93, 29, 91, 106, -2, -23, 31, 2, 1, 3, 2, -126, 1, 1, 0, -113, 12, -69, 88, -108, -124, 7, 109, -53, -13, -38, 65, -21, 59, -27, 110, 41, 127, 51, -99, -14, 19, -20, -86, 4, 93, -59, -16, 125, -59, -34, 71, -30, 80, 73, -60, -79, -60, -13, 68, 9, -46, 10, 102, 35, -111, 85, 59, 126, -6, 112, -41, -17, -16, 40, -36, -19, -48, -104, -87, -63, -30, -103, -113, 75, -20, 69, 26, -67, 42, 118, -53, 35, -91, -42, -83, -126, 126, -35, -95, 101, -48, 47, 78, 22, 14, 89, -11, 123, 22, 52, 91, -41, 41, 122, -1, -76, 127, 53, 10, -121, 45, 60, 20, -105, 117, -37, -15, -73, -32, 111, -41, -24, 49, -9, -118, -63, 94, 53, 90, -81, 119, 64, 85, -70, 15, -12, 69, 117, -94, -122, 121, -114, 53, -59, 51, -76, 2, 118, -28, 78, 88, 54, -95, -38, 117, 100, -83, -6, -11, 56, -92, -109, -87, -65, 16, -14, 19, -90, 87, -84, 18, 41, 28, 27, -27, 105, -105, -4, 106, -46, 123, -103, -89, -4, -119, 119, -46, 101, 76, -21, -86, 124, 117, 59, -100, -38, 76, 100, 103, 26, -114, -24, -3, 71, 107, 126, -30, -61, 126, -107, 87, -99, 112, 68, 30, 111, -85, -109, -92, 19, -85, 102, 74, -55, -104, -6, 37, -108, 63, 43, 82, -63, -7, -59, -22, 100, -17, 74, 27, -54, 1, 73, -25, 23, -94, 20, 1, 120, -106, 8, 12, 72, -92, 7, -36, 71, 118, -53, -34, -106, -67, 76, -95, -124, 123, 2, -127, -127, 0, -22, -64, -103, 23, 28, -101, -107, 39, -116, 7, -65, -98, -105, 69, 24, -123, 87, -111, 118, -98, -89, -75, 43, -10, -70, -109, -32, -42, -88, 72, -60, -89, 13, 24, -90, -24, -88, -94, -38, 83, 104, 103, 107, 51, -66, -14, -104, -69, 20, 77, -102, -8, -75, -69, -83, 34, 70, -12, 44, 44, -51, 116, 118, -22, -78, 27, -31, 74, 119, 31, -110, -25, -83, -10, 0, -75, -109, 42, -9, 71, -9, -71, 119, 85, -121, 17, 10, -80, -40, 3, 35, 24, 118, -117, 88, 106, -15, 124, 109, -60, -3, 64, -88, 24, 30, -123, -121, 111, 95, 10, 44, -67, -69, 3, -122, -97, 33, 121, -85, 85, 112, -89, 89, 122, 117, 123, 97, -101, 2, -127, -127, 0, -23, -2, -9, 25, 52, -88, -81, 55, -103, -25, 18, -85, -105, -99, 94, 2, 117, -106, -83, -115, 105, 21, 102, 73, -106, 28, -28, -94, -83, 8, 47, 24, 98, 36, 52, 77, 43, -120, -119, 20, -87, -52, -99, -19, 71, 111, 48, 46, -36, 78, -26, 91, -22, 119, -67, -111, -14, -16, 76, 63, 52, -70, 9, -74, 57, 68, 40, -5, -76, -32, 85, 91, -58, -49, 78, -20, 14, 97, 67, 126, 0, 3, 124, -19, -53, 25, -66, 89, -113, -79, 75, 23, 50, 96, 77, 65, 54, 50, 114, -6, 52, 41, -24, 127, 101, 29, 17, 34, -127, 102, 55, 126, -46, -55, -88, 25, 11, 92, -101, -113, -35, 45, -31, -59, 2, -111, 64, -51, 2, -127, -127, 0, -100, -128, 102, 15, 104, 103, -72, -59, 8, 5, 42, 105, -70, 46, 16, 88, -27, 11, -92, 105, -59, 35, 114, -92, 124, 98, -107, -28, 112, 48, -125, 26, 8, -69, 25, -16, 112, 108, -111, -116, -16, 68, -14, 34, 127, 76, 101, -46, 13, -119, 17, -5, 35, -46, 115, 108, 47, 77, 114, -56, -120, -8, 79, 71, 33, 103, -21, -122, -6, 21, 12, -102, 115, -7, 85, -50, 98, 28, -92, -38, -91, 38, 79, -114, 90, 11, 92, 117, -27, 87, 108, -70, -7, -78, 58, -15, -10, 82, -13, -40, -88, -43, -59, 101, 105, -82, 90, 74, 63, 92, 29, -45, -46, 2, 89, -65, 107, -90, 114, 56, -11, -60, -26, 81, -93, -89, -106, 103, 2, -127, -127, 0, -101, -1, 79, 102, 35, 27, 31, 122, 102, -102, 12, 114, 101, 19, -108, 1, -93, -71, -55, 8, -16, -72, -18, -37, -71, 104, -104, 108, 115, 90, -54, 16, 65, 109, 120, 51, 114, 91, 6, 13, -58, -120, 105, 72, -38, 74, 32, 31, 61, -119, -18, -25, -15, -91, 41, 11, -9, 74, -35, 127, 120, 124, 6, 121, 123, -126, -59, -3, 35, 64, 56, -25, -39, -33, -119, -14, -76, 64, -41, -87, 85, 87, -88, -98, -121, 102, 126, -26, 95, -53, -121, 100, -52, 64, 51, -128, -50, -52, 76, -90, -51, 113, 69, -86, 67, 104, -74, 23, 0, -18, -49, -87, -31, -37, -59, 102, 7, -109, 18, 95, -24, -55, 65, 46, 1, -74, 43, 51, 2, -127, -128, 99, 42, -83, -39, 26, -35, -92, 98, -39, -107, -90, 114, 98, 91, 5, -51, -87, 70, 33, -12, -23, 89, 115, -18, -113, -102, 45, -21, 113, -95, -63, -84, 27, -45, 26, 13, -42, -94, -119, 117, -121, 27, 106, 123, -21, 110, 85, 97, -76, -95, 44, 96, -93, -92, 105, -17, 122, 119, 88, 43, 53, -57, -8, 85, -71, -73, 108, -54, -49, -64, 119, 72, 69, -2, -87, 69, 47, -79, -29, -87, -116, 5, -5, -102, -89, 82, 104, 25, -59, -60, 73, -114, 13, -63, -37, 27, -91, -118, 59, -44, -5, -127, -125, 41, 30, 52, 118, -114, -38, 122, -76, 5, -121, 38, -3, 28, -115, 20, 123, -119, 101, -33, -113, 21, -13, -98, -68, 55};
    public static byte[] templateFile = new byte[]{48, -126, 6, -82, 6, 9, 42, -122, 72, -122, -9, 13, 1, 7, 2, -96, -126, 6, -97, 48, -126, 6, -101, 2, 1, 1, 49, 11, 48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0, 48, 11, 6, 9, 42, -122, 72, -122, -9, 13, 1, 7, 1, -96, -126, 4, -84, 48, -126, 4, -88, 48, -126, 3, -112, -96, 3, 2, 1, 2, 2, 9, 0, -109, 110, -84, -66, 7, -14, 1, -33, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 5, 5, 0, 48, -127, -108, 49, 11, 48, 9, 6, 3, 85, 4, 6, 19, 2, 85, 83, 49, 19, 48, 17, 6, 3, 85, 4, 8, 19, 10, 67, 97, 108, 105, 102, 111, 114, 110, 105, 97, 49, 22, 48, 20, 6, 3, 85, 4, 7, 19, 13, 77, 111, 117, 110, 116, 97, 105, 110, 32, 86, 105, 101, 119, 49, 16, 48, 14, 6, 3, 85, 4, 10, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 16, 48, 14, 6, 3, 85, 4, 11, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 16, 48, 14, 6, 3, 85, 4, 3, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 34, 48, 32, 6, 9, 42, -122, 72, -122, -9, 13, 1, 9, 1, 22, 19, 97, 110, 100, 114, 111, 105, 100, 64, 97, 110, 100, 114, 111, 105, 100, 46, 99, 111, 109, 48, 30, 23, 13, 48, 56, 48, 50, 50, 57, 48, 49, 51, 51, 52, 54, 90, 23, 13, 51, 53, 48, 55, 49, 55, 48, 49, 51, 51, 52, 54, 90, 48, -127, -108, 49, 11, 48, 9, 6, 3, 85, 4, 6, 19, 2, 85, 83, 49, 19, 48, 17, 6, 3, 85, 4, 8, 19, 10, 67, 97, 108, 105, 102, 111, 114, 110, 105, 97, 49, 22, 48, 20, 6, 3, 85, 4, 7, 19, 13, 77, 111, 117, 110, 116, 97, 105, 110, 32, 86, 105, 101, 119, 49, 16, 48, 14, 6, 3, 85, 4, 10, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 16, 48, 14, 6, 3, 85, 4, 11, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 16, 48, 14, 6, 3, 85, 4, 3, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 34, 48, 32, 6, 9, 42, -122, 72, -122, -9, 13, 1, 9, 1, 22, 19, 97, 110, 100, 114, 111, 105, 100, 64, 97, 110, 100, 114, 111, 105, 100, 46, 99, 111, 109, 48, -126, 1, 32, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -126, 1, 13, 0, 48, -126, 1, 8, 2, -126, 1, 1, 0, -42, -109, 25, 4, -34, -58, 11, 36, -79, -19, -57, 98, -32, -39, -40, 37, 62, 62, -51, 108, -21, 29, -30, -1, 6, -116, -88, -24, -68, -88, -51, 107, -45, 120, 110, -89, 10, -89, 108, -26, 14, -69, 15, -103, 53, 89, -1, -39, 62, 119, -87, 67, -25, -24, 61, 75, 100, -72, -28, -2, -94, -45, -26, 86, -15, -30, 103, -88, 27, -65, -78, 48, -75, 120, -62, 4, 67, -66, 76, 114, 24, -72, 70, -11, 33, 21, -122, -16, 56, -95, 78, -119, -62, -66, 56, 127, -114, -66, -49, -113, -54, -61, -38, 30, -29, 48, -55, -22, -109, -48, -89, -61, -36, 74, -13, 80, 34, 13, 80, 8, 7, 50, -32, -128, -105, 23, -18, 106, 5, 51, 89, -26, -90, -108, -20, 44, -77, -14, -124, -96, -92, 102, -56, 122, -108, -40, 59, 49, 9, 58, 103, 55, 46, 47, 100, 18, -64, 110, 109, 66, -15, 88, 24, -33, -2, 3, -127, -52, 12, -44, 68, -38, 108, -35, -61, -72, 36, 88, 25, 72, 1, -77, 37, 100, 19, 79, -65, -34, -104, -55, 40, 119, 72, -37, -11, 103, 106, 84, 13, -127, 84, -56, -69, -54, 7, -71, -30, 71, 85, 51, 17, -60, 107, -102, -9, 111, -34, -20, -52, -114, 105, -25, -56, -94, -48, -114, 120, 38, 32, -108, 63, -103, 114, 125, 60, 4, -2, 114, -103, 29, -103, -33, -101, -82, 56, -96, -78, 23, 127, -93, 29, 91, 106, -2, -23, 31, 2, 1, 3, -93, -127, -4, 48, -127, -7, 48, 29, 6, 3, 85, 29, 14, 4, 22, 4, 20, 72, 89, 0, 86, 61, 39, 44, 70, -82, 17, -122, 5, -92, 116, 25, -84, 9, -54, -116, 17, 48, -127, -55, 6, 3, 85, 29, 35, 4, -127, -63, 48, -127, -66, -128, 20, 72, 89, 0, 86, 61, 39, 44, 70, -82, 17, -122, 5, -92, 116, 25, -84, 9, -54, -116, 17, -95, -127, -102, -92, -127, -105, 48, -127, -108, 49, 11, 48, 9, 6, 3, 85, 4, 6, 19, 2, 85, 83, 49, 19, 48, 17, 6, 3, 85, 4, 8, 19, 10, 67, 97, 108, 105, 102, 111, 114, 110, 105, 97, 49, 22, 48, 20, 6, 3, 85, 4, 7, 19, 13, 77, 111, 117, 110, 116, 97, 105, 110, 32, 86, 105, 101, 119, 49, 16, 48, 14, 6, 3, 85, 4, 10, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 16, 48, 14, 6, 3, 85, 4, 11, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 16, 48, 14, 6, 3, 85, 4, 3, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 34, 48, 32, 6, 9, 42, -122, 72, -122, -9, 13, 1, 9, 1, 22, 19, 97, 110, 100, 114, 111, 105, 100, 64, 97, 110, 100, 114, 111, 105, 100, 46, 99, 111, 109, -126, 9, 0, -109, 110, -84, -66, 7, -14, 1, -33, 48, 12, 6, 3, 85, 29, 19, 4, 5, 48, 3, 1, 1, -1, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 5, 5, 0, 3, -126, 1, 1, 0, 122, -81, -106, -116, -21, 80, -60, 65, 5, 81, 24, -48, -38, -85, -81, 1, 91, -118, 118, 90, 39, -89, 21, -94, -62, -76, 79, 34, 20, 21, -1, -38, -50, 3, 9, 90, -65, -92, 45, -9, 7, 8, 114, 108, 32, 105, -27, -61, 110, -35, -82, 4, 0, -66, 41, 69, 44, 8, 75, -62, 126, -74, -95, 126, -84, -99, -66, 24, 44, 32, 78, -79, 83, 17, -12, 85, -40, 36, -74, 86, -37, -28, -36, 34, 64, -111, 45, 117, -122, -2, -120, -107, 29, 1, -88, -2, -75, -82, 90, 66, 96, 83, 93, -8, 52, 49, 5, 36, 34, 70, -116, 54, -30, 44, 42, 94, -7, -108, -42, 29, -41, 48, 106, -28, -55, -10, -107, 27, -93, -63, 47, 29, 25, 20, -35, -58, 31, 26, 98, -38, 45, -8, 39, -10, 3, -2, -91, 96, 59, 44, 84, 13, -67, 124, 1, -100, 54, -70, -78, -102, 66, 113, -63, 23, -33, 82, 60, -37, -59, -13, -127, 122, 73, -32, -17, -90, 12, -67, 127, 116, 23, 126, 122, 79, 25, 61, 67, -12, 34, 7, 114, 102, 110, 76, 77, -125, -31, -67, 90, -122, 8, 124, -13, 79, 45, -20, 33, -30, 69, -54, 108, 43, -80, 22, -26, -125, 99, -128, 80, -46, -60, 48, -18, -89, -62, 106, 28, 73, -45, 118, 10, 88, -85, 127, 26, -126, -52, -109, -117, 72, 49, 56, 67, 36, -67, 4, 1, -6, 18, 22, 58, 80, 87, 14, 104, 77, 49, -126, 1, -54, 48, -126, 1, -58, 2, 1, 1, 48, -127, -94, 48, -127, -108, 49, 11, 48, 9, 6, 3, 85, 4, 6, 19, 2, 85, 83, 49, 19, 48, 17, 6, 3, 85, 4, 8, 19, 10, 67, 97, 108, 105, 102, 111, 114, 110, 105, 97, 49, 22, 48, 20, 6, 3, 85, 4, 7, 19, 13, 77, 111, 117, 110, 116, 97, 105, 110, 32, 86, 105, 101, 119, 49, 16, 48, 14, 6, 3, 85, 4, 10, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 16, 48, 14, 6, 3, 85, 4, 11, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 16, 48, 14, 6, 3, 85, 4, 3, 19, 7, 65, 110, 100, 114, 111, 105, 100, 49, 34, 48, 32, 6, 9, 42, -122, 72, -122, -9, 13, 1, 9, 1, 22, 19, 97, 110, 100, 114, 111, 105, 100, 64, 97, 110, 100, 114, 111, 105, 100, 46, 99, 111, 109, 2, 9, 0, -109, 110, -84, -66, 7, -14, 1, -33, 48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 4, -126, 1, 0};
}