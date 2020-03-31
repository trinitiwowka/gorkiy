package com.google.firebase.ml.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-ml-vision@@24.0.1 */
public final class zze implements zzf {
    private final Barcode zzbjz;

    public zze(Barcode barcode) {
        this.zzbjz = barcode;
    }

    public final Rect getBoundingBox() {
        return this.zzbjz.getBoundingBox();
    }

    public final Point[] getCornerPoints() {
        return this.zzbjz.cornerPoints;
    }

    public final String getRawValue() {
        return this.zzbjz.rawValue;
    }

    public final byte[] getRawBytes() {
        return this.zzbjz.rawBytes;
    }

    public final String getDisplayValue() {
        return this.zzbjz.displayValue;
    }

    public final int getFormat() {
        return this.zzbjz.format;
    }

    public final int getValueType() {
        return this.zzbjz.valueFormat;
    }

    public final FirebaseVisionBarcode.Email getEmail() {
        Barcode.Email email = this.zzbjz.email;
        if (email != null) {
            return new FirebaseVisionBarcode.Email(email.type, email.address, email.subject, email.body);
        }
        return null;
    }

    public final FirebaseVisionBarcode.Phone getPhone() {
        Barcode.Phone phone = this.zzbjz.phone;
        if (phone != null) {
            return new FirebaseVisionBarcode.Phone(phone.number, phone.type);
        }
        return null;
    }

    public final FirebaseVisionBarcode.Sms getSms() {
        Barcode.Sms sms = this.zzbjz.sms;
        if (sms != null) {
            return new FirebaseVisionBarcode.Sms(sms.message, sms.phoneNumber);
        }
        return null;
    }

    public final FirebaseVisionBarcode.WiFi getWifi() {
        Barcode.WiFi wiFi = this.zzbjz.wifi;
        if (wiFi != null) {
            return new FirebaseVisionBarcode.WiFi(wiFi.ssid, wiFi.password, wiFi.encryptionType);
        }
        return null;
    }

    public final FirebaseVisionBarcode.UrlBookmark getUrl() {
        Barcode.UrlBookmark urlBookmark = this.zzbjz.url;
        if (urlBookmark != null) {
            return new FirebaseVisionBarcode.UrlBookmark(urlBookmark.title, urlBookmark.url);
        }
        return null;
    }

    public final FirebaseVisionBarcode.GeoPoint getGeoPoint() {
        Barcode.GeoPoint geoPoint = this.zzbjz.geoPoint;
        if (geoPoint != null) {
            return new FirebaseVisionBarcode.GeoPoint(geoPoint.lat, geoPoint.lng);
        }
        return null;
    }

    public final FirebaseVisionBarcode.CalendarEvent getCalendarEvent() {
        Barcode.CalendarEvent calendarEvent = this.zzbjz.calendarEvent;
        if (calendarEvent == null) {
            return null;
        }
        return new FirebaseVisionBarcode.CalendarEvent(calendarEvent.summary, calendarEvent.description, calendarEvent.location, calendarEvent.organizer, calendarEvent.status, zza(calendarEvent.start), zza(calendarEvent.end));
    }

    public final FirebaseVisionBarcode.ContactInfo getContactInfo() {
        Barcode.ContactInfo contactInfo = this.zzbjz.contactInfo;
        FirebaseVisionBarcode.PersonName personName = null;
        if (contactInfo == null) {
            return null;
        }
        Barcode.PersonName personName2 = contactInfo.name;
        if (personName2 != null) {
            personName = new FirebaseVisionBarcode.PersonName(personName2.formattedName, personName2.pronunciation, personName2.prefix, personName2.first, personName2.middle, personName2.last, personName2.suffix);
        }
        FirebaseVisionBarcode.PersonName personName3 = personName;
        String str = contactInfo.organization;
        String str2 = contactInfo.title;
        Barcode.Phone[] phoneArr = contactInfo.phones;
        ArrayList arrayList = new ArrayList();
        if (phoneArr != null) {
            for (Barcode.Phone phone : phoneArr) {
                if (phone != null) {
                    arrayList.add(new FirebaseVisionBarcode.Phone(phone.number, phone.type));
                }
            }
        }
        Barcode.Email[] emailArr = contactInfo.emails;
        ArrayList arrayList2 = new ArrayList();
        if (emailArr != null) {
            for (Barcode.Email email : emailArr) {
                if (email != null) {
                    arrayList2.add(new FirebaseVisionBarcode.Email(email.type, email.address, email.subject, email.body));
                }
            }
        }
        String[] strArr = contactInfo.urls;
        Barcode.Address[] addressArr = contactInfo.addresses;
        ArrayList arrayList3 = new ArrayList();
        if (addressArr != null) {
            for (Barcode.Address address : addressArr) {
                if (address != null) {
                    arrayList3.add(new FirebaseVisionBarcode.Address(address.type, address.addressLines));
                }
            }
        }
        return new FirebaseVisionBarcode.ContactInfo(personName3, str, str2, arrayList, arrayList2, strArr, arrayList3);
    }

    public final FirebaseVisionBarcode.DriverLicense getDriverLicense() {
        Barcode.DriverLicense driverLicense = this.zzbjz.driverLicense;
        if (driverLicense == null) {
            return null;
        }
        return new FirebaseVisionBarcode.DriverLicense(driverLicense.documentType, driverLicense.firstName, driverLicense.middleName, driverLicense.lastName, driverLicense.gender, driverLicense.addressStreet, driverLicense.addressCity, driverLicense.addressState, driverLicense.addressZip, driverLicense.licenseNumber, driverLicense.issueDate, driverLicense.expiryDate, driverLicense.birthDate, driverLicense.issuingCountry);
    }

    private static FirebaseVisionBarcode.CalendarDateTime zza(Barcode.CalendarDateTime calendarDateTime) {
        if (calendarDateTime == null) {
            return null;
        }
        return new FirebaseVisionBarcode.CalendarDateTime(calendarDateTime.year, calendarDateTime.month, calendarDateTime.day, calendarDateTime.hours, calendarDateTime.minutes, calendarDateTime.seconds, calendarDateTime.isUtc, calendarDateTime.rawValue);
    }
}
