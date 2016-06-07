/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package vdjserver;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum Nucleotide_ambiguous implements org.apache.thrift.TEnum {
  Nucleotide_ambiguous_B(0),
  Nucleotide_ambiguous_D(1),
  Nucleotide_ambiguous_H(2),
  Nucleotide_ambiguous_K(3),
  Nucleotide_ambiguous_M(4),
  Nucleotide_ambiguous_N(5),
  Nucleotide_ambiguous_R(6),
  Nucleotide_ambiguous_S(7),
  Nucleotide_ambiguous_V(8),
  Nucleotide_ambiguous_W(9),
  Nucleotide_ambiguous_Y(10),
  Nucleotide_ambiguous_b(11),
  Nucleotide_ambiguous_d(12),
  Nucleotide_ambiguous_h(13),
  Nucleotide_ambiguous_k(14),
  Nucleotide_ambiguous_m(15),
  Nucleotide_ambiguous_n(16),
  Nucleotide_ambiguous_r(17),
  Nucleotide_ambiguous_s(18),
  Nucleotide_ambiguous_v(19),
  Nucleotide_ambiguous_w(20),
  Nucleotide_ambiguous_y(21);

  private final int value;

  private Nucleotide_ambiguous(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Nucleotide_ambiguous findByValue(int value) { 
    switch (value) {
      case 0:
        return Nucleotide_ambiguous_B;
      case 1:
        return Nucleotide_ambiguous_D;
      case 2:
        return Nucleotide_ambiguous_H;
      case 3:
        return Nucleotide_ambiguous_K;
      case 4:
        return Nucleotide_ambiguous_M;
      case 5:
        return Nucleotide_ambiguous_N;
      case 6:
        return Nucleotide_ambiguous_R;
      case 7:
        return Nucleotide_ambiguous_S;
      case 8:
        return Nucleotide_ambiguous_V;
      case 9:
        return Nucleotide_ambiguous_W;
      case 10:
        return Nucleotide_ambiguous_Y;
      case 11:
        return Nucleotide_ambiguous_b;
      case 12:
        return Nucleotide_ambiguous_d;
      case 13:
        return Nucleotide_ambiguous_h;
      case 14:
        return Nucleotide_ambiguous_k;
      case 15:
        return Nucleotide_ambiguous_m;
      case 16:
        return Nucleotide_ambiguous_n;
      case 17:
        return Nucleotide_ambiguous_r;
      case 18:
        return Nucleotide_ambiguous_s;
      case 19:
        return Nucleotide_ambiguous_v;
      case 20:
        return Nucleotide_ambiguous_w;
      case 21:
        return Nucleotide_ambiguous_y;
      default:
        return null;
    }
  }
}
