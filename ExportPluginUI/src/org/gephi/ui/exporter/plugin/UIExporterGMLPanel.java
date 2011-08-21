/*
Copyright 2008-2011 Gephi
Authors : Taras Klaskovsky <megaterik@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.ui.exporter.plugin;

import org.gephi.io.exporter.plugin.ExporterGML;
import org.gephi.lib.validation.ValidationClient;
import org.netbeans.validation.api.builtin.Validators;
import org.netbeans.validation.api.ui.ValidationGroup;
import org.netbeans.validation.api.ui.ValidationPanel;

/**
 *
 * @author megaterik
 */
public class UIExporterGMLPanel extends javax.swing.JPanel implements ValidationClient {

    /** Creates new customizer UIExporterGMLPanel */
    public UIExporterGMLPanel() {
        initComponents();
    }

    void setup(ExporterGML exporter) {
        //get
        exportColorsCheckBox.setSelected(exporter.isExportColor());
        exportEdgeWeightCheckBox.setSelected(exporter.isExportEdgeSize());
        exportNotRecognizedCheckBox.setSelected(exporter.isExportNotRecognizedElements());
        exportPositionCheckBox.setSelected(exporter.isExportCoordinates());
        exportSizeCheckBox.setSelected(exporter.isExportNodeSize());
        normalizeCheckBox.setSelected(exporter.isNormalize());
        exportLabelCheckBox.setSelected(exporter.isExportLabel());
        spacesTextField.setText(Integer.toString(exporter.getSpaces()));

    }

    void unsetup(ExporterGML exporter) {
        //set
        exporter.setExportColor(exportColorsCheckBox.isSelected());
        exporter.setExportCoordinates(exportPositionCheckBox.isSelected());
        exporter.setExportEdgeSize(exportEdgeWeightCheckBox.isSelected());
        exporter.setExportLabel(exportLabelCheckBox.isSelected());
        exporter.setExportNodeSize(exportSizeCheckBox.isSelected());
        exporter.setExportNotRecognizedElements(exportNotRecognizedCheckBox.isSelected());
        exporter.setNormalize(normalizeCheckBox.isSelected());
        exporter.setSpaces(Integer.parseInt(spacesTextField.getText()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exportLabel = new javax.swing.JLabel();
        exportPositionCheckBox = new javax.swing.JCheckBox();
        exportColorsCheckBox = new javax.swing.JCheckBox();
        exportSizeCheckBox = new javax.swing.JCheckBox();
        exportEdgeWeightCheckBox = new javax.swing.JCheckBox();
        exportNotRecognizedCheckBox = new javax.swing.JCheckBox();
        normalizeCheckBox = new javax.swing.JCheckBox();
        normalizeLabel = new javax.swing.JLabel();
        exportLabelCheckBox = new javax.swing.JCheckBox();
        spacesLabel = new javax.swing.JLabel();
        spacesTextField = new javax.swing.JTextField();

        exportLabel.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.exportLabel.text")); // NOI18N

        exportPositionCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.positionLabel.text")); // NOI18N

        exportColorsCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.colorsLabel.text")); // NOI18N

        exportSizeCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.sizeLabel.text")); // NOI18N

        exportEdgeWeightCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.edgeWeightLabel.text")); // NOI18N

        exportNotRecognizedCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.attributes.text")); // NOI18N
        exportNotRecognizedCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportNotRecognizedCheckBoxActionPerformed(evt);
            }
        });

        normalizeCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.normalize.text")); // NOI18N
        normalizeCheckBox.setLabel(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.normalize.text")); // NOI18N

        normalizeLabel.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        normalizeLabel.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.normalizeHintLabel.text")); // NOI18N

        exportLabelCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.labelLabel.text")); // NOI18N

        spacesLabel.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.indentationLabel.text")); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(exportLabel)
                    .add(normalizeCheckBox)
                    .add(spacesLabel))
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(normalizeLabel)
                    .add(exportEdgeWeightCheckBox)
                    .add(exportSizeCheckBox)
                    .add(exportColorsCheckBox)
                    .add(exportPositionCheckBox)
                    .add(exportLabelCheckBox)
                    .add(exportNotRecognizedCheckBox)
                    .add(spacesTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(exportLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(exportPositionCheckBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(exportColorsCheckBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(exportSizeCheckBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(exportEdgeWeightCheckBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(exportLabelCheckBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(exportNotRecognizedCheckBox)
                .add(3, 3, 3)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(normalizeCheckBox)
                    .add(normalizeLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(spacesLabel)
                    .add(spacesTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(21, 21, 21))
        );

        exportNotRecognizedCheckBox.getAccessibleContext().setAccessibleName("\n"); // NOI18N
        exportNotRecognizedCheckBox.getAccessibleContext().setAccessibleDescription("");
        spacesTextField.getAccessibleContext().setAccessibleName("Indentation");
    }// </editor-fold>//GEN-END:initComponents

private void exportNotRecognizedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportNotRecognizedCheckBoxActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_exportNotRecognizedCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox exportColorsCheckBox;
    private javax.swing.JCheckBox exportEdgeWeightCheckBox;
    private javax.swing.JLabel exportLabel;
    private javax.swing.JCheckBox exportLabelCheckBox;
    private javax.swing.JCheckBox exportNotRecognizedCheckBox;
    private javax.swing.JCheckBox exportPositionCheckBox;
    private javax.swing.JCheckBox exportSizeCheckBox;
    private javax.swing.JCheckBox normalizeCheckBox;
    private javax.swing.JLabel normalizeLabel;
    private javax.swing.JLabel spacesLabel;
    private javax.swing.JTextField spacesTextField;
    // End of variables declaration//GEN-END:variables

    public void validate(ValidationGroup group) {
        group.add(spacesTextField, Validators.REQUIRE_NON_EMPTY_STRING, Validators.REQUIRE_NON_NEGATIVE_NUMBER, Validators.REQUIRE_VALID_INTEGER);
    }

    public static ValidationPanel createValidationPanel(UIExporterGMLPanel innerPanel) {
        ValidationPanel validationPanel = new ValidationPanel();
        validationPanel.setInnerComponent(innerPanel);

        ValidationGroup group = validationPanel.getValidationGroup();
        innerPanel.validate(group);

        return validationPanel;
    }
}