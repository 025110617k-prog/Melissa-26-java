public class HorarioJava extends javax.swing.JFrame {

    public HorarioJava() {
        String[] columnas = {"HORAS", "LU", "MA", "MI", "JU", "VI", "SA"};

        Object[][] datos = {
            {"08:00 - 08:50", "", "", "", "", "", ""},
            {"08:50 - 09:40", "", "", "", "", "", ""},
            {"09:40 - 10:30", "", "", "", "", "", ""},
            {"10:30 - 11:20", "", "", "", "", "", ""},
            {"11:20 - 14:00", "", "", "", "", "", ""},
            {"14:00 - 16:20", "", "", "", "", "", ""},
            {"16:20 - 17:10", "", "", "", "", "", ""},
            {"17:10 - 18:50", "", "", "", "", "", ""},
            {"18:50 - 19:40", "", "", "", "", "", ""},
            {"19:40 - 20:30", "", "", "", "", "", ""},
            {"20:30 - 22:10", "", "", "", "", "", ""}
        };

        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        javax.swing.JTable tabla = new javax.swing.JTable(modelo);
        tabla.setRowHeight(95);
        tabla.setShowGrid(true);
        tabla.setGridColor(java.awt.Color.GRAY);
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 11));
        tabla.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));

        tabla.getColumnModel().getColumn(0).setPreferredWidth(110);
        for (int i = 1; i < columnas.length; i++) {
            tabla.getColumnModel().getColumn(i).setPreferredWidth(160);
        }

        tabla.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected,
                                                                    boolean hasFocus, int row, int column) {
                javax.swing.JLabel label = (javax.swing.JLabel) super.getTableCellRendererComponent(
                        table, value, isSelected, hasFocus, row, column);

                label.setOpaque(true);
                label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
                label.setHorizontalAlignment(column == 0 ? javax.swing.SwingConstants.CENTER : javax.swing.SwingConstants.LEFT);
                label.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
                label.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 11));

                if (column == 0) {
                    label.setBackground(new java.awt.Color(230, 230, 230));
                } else {
                    label.setBackground(java.awt.Color.WHITE);
                }

                if (isSelected) {
                    label.setBackground(table.getSelectionBackground());
                    label.setForeground(table.getSelectionForeground());
                } else {
                    label.setForeground(java.awt.Color.BLACK);
                }

                return label;
            }
        });

        tabla.setValueAt("Escuela Profesional:\nCurso: ALGORITMOS Y PROGRAMACION I\n Ambiente: L-601", 0, 1);
        tabla.setValueAt("Escuela Profesional:\nCurso: INGENIERIA DE SISTEMAS\nAmbiente: L-504", 0, 3);
        tabla.setValueAt("Escuela Profesional:\nCurso: ALGORITMOS Y PROGRAMACION I\nAmbiente: L-601", 1, 1);
        tabla.setValueAt("Escuela Profesional:\nCurso: INGENIERIA DE SISTEMAS\nAmbiente: L-504", 1, 3);
        tabla.setValueAt("Escuela Profesional:\nCurso: CALCULO I\nAmbiente: L-602", 5, 1);
        tabla.setValueAt("Escuela Profesional:\nCurso: CALCULO I\nAmbiente: L-602", 5, 3);
        tabla.setValueAt("Escuela Profesional:\nCurso: INVESTIGACION DE OPERACIONES I\nAmbiente: L-503", 6, 1);
        tabla.setValueAt("Escuela Profesional:\nCurso: ESTADISTICA\nAmbiente: L-509", 7, 1);
        tabla.setValueAt("Escuela Profesional:\nCurso: MATEMATICA DISCRETA\nAmbiente: L-504", 7, 5);

        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(tabla);

        javax.swing.JFrame ventana = new javax.swing.JFrame("Horario en Java");
        ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        ventana.add(scroll);
        ventana.setSize(1200, 800);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(HorarioJava::new);
    }
}