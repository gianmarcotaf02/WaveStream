package it.wavestream.app.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.CheckBoxOutlineBlank
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import it.wavestream.app.ui.theme.WaveStreamColors
import java.util.Calendar

/** Criterio di ordinamento dei contenuti in una categoria. */
enum class ContentSortField(val label: String) {
    RELEASE_DATE("Data di uscita"),
    ALPHABETICAL("A-Z"),
    TMDB_RATING("Voto TMDB")
}

/** Direzione dell'ordinamento, selezionabile liberamente dall'utente. */
enum class SortDirection(val label: String) {
    ASC("Crescente"),
    DESC("Decrescente")
}

/** Filtri applicabili su anni, voto TMDB e categorie. `null`/vuoto = nessun filtro. */
data class ContentFilterState(
    val yearFrom: Int? = null,
    val yearTo: Int? = null,
    val minRating: Float? = null,
    /** Categorie selezionate (multi-scelta con checkbox). Vuoto = tutte. */
    val categories: Set<String> = emptySet()
) {
    val isActive: Boolean
        get() = yearFrom != null || yearTo != null || minRating != null || categories.isNotEmpty()
    val activeCount: Int get() = (if (yearFrom != null) 1 else 0) +
        (if (yearTo != null) 1 else 0) +
        (if (minRating != null) 1 else 0) +
        (if (categories.isNotEmpty()) 1 else 0)

    fun normalized(): ContentFilterState {
        // Evita intervalli invertiti che darebbero risultati vuoti.
        if (yearFrom != null && yearTo != null && yearFrom > yearTo) {
            return copy(yearFrom = yearTo, yearTo = yearFrom)
        }
        return this
    }
}

/** Stato completo di ordinamento + filtri condiviso tra Film e Serie. */
data class SortFilterState(
    val sortField: ContentSortField = ContentSortField.RELEASE_DATE,
    val direction: SortDirection = SortDirection.DESC,
    val filter: ContentFilterState = ContentFilterState()
)

/**
 * Barra di ordinamento e filtri, ottimizzata per D-pad.
 *
 * - Tre chip per il criterio (data di uscita, alfabetico, voto TMDB)
 * - Toggle crescente/decrescente
 * - Pulsante "Filtri" che espande un pannello con stepper per anni (da/a) e voto minimo
 */
@Composable
fun ContentSortFilterBar(
    state: SortFilterState,
    onStateChange: (SortFilterState) -> Unit,
    modifier: Modifier = Modifier,
    /** Categorie disponibili per il filtro multi-scelta (vuoto = nasconde la sezione). */
    availableCategories: List<String> = emptyList(),
    /** Mostra la sezione categorie (tipicamente solo su "Tutti i film/serie"). */
    showCategoryFilter: Boolean = false
) {
    var showFilters by remember { mutableStateOf(false) }

    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "Ordina:",
                style = MaterialTheme.typography.labelLarge,
                color = WaveStreamColors.TextTertiary
            )

            ContentSortField.entries.forEach { field ->
                SortChip(
                    label = field.label,
                    selected = state.sortField == field,
                    onClick = {
                        // Direzione naturale del criterio: A-Z crescente, gli altri decrescenti.
                        // Senza questo, selezionando "A-Z" restava la direzione Decrescente (Z-A).
                        val naturalDirection = when (field) {
                            ContentSortField.ALPHABETICAL -> SortDirection.ASC
                            else -> SortDirection.DESC
                        }
                        onStateChange(state.copy(sortField = field, direction = naturalDirection))
                    }
                )
            }

            DirectionToggle(
                direction = state.direction,
                onToggle = {
                    onStateChange(
                        state.copy(
                            direction = if (state.direction == SortDirection.ASC) {
                                SortDirection.DESC
                            } else {
                                SortDirection.ASC
                            }
                        )
                    )
                }
            )

            FilterToggleButton(
                activeCount = state.filter.activeCount,
                expanded = showFilters,
                onClick = { showFilters = !showFilters }
            )
        }

        AnimatedVisibility(visible = showFilters) {
            FilterPanel(
                state = state,
                onStateChange = { onStateChange(it) },
                onClose = { showFilters = false },
                availableCategories = availableCategories,
                showCategoryFilter = showCategoryFilter
            )
        }
    }
}

@Composable
private fun SortChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val scale by animateFloatAsState(if (isFocused) 1.05f else 1f, label = "sortChipScale")

    val background by animateColorAsState(
        targetValue = when {
            selected -> WaveStreamColors.Accent.copy(alpha = 0.30f)
            isFocused -> WaveStreamColors.BackgroundTertiary
            else -> WaveStreamColors.BackgroundSecondary.copy(alpha = 0.7f)
        },
        label = "sortChipBg"
    )
    val border by animateColorAsState(
        targetValue = when {
            isFocused -> WaveStreamColors.Accent
            selected -> WaveStreamColors.Accent.copy(alpha = 0.6f)
            else -> Color.Transparent
        },
        label = "sortChipBorder"
    )

    Box(
        modifier = Modifier
            .graphicsLayer { scaleX = scale; scaleY = scale }
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, border, RoundedCornerShape(8.dp))
            .background(background)
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 8.dp)
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelLarge,
            color = if (selected || isFocused) WaveStreamColors.TextPrimary else WaveStreamColors.TextSecondary,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
        )
    }
}

@Composable
private fun DirectionToggle(
    direction: SortDirection,
    onToggle: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val scale by animateFloatAsState(if (isFocused) 1.05f else 1f, label = "dirToggleScale")
    val background by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.BackgroundTertiary else WaveStreamColors.BackgroundSecondary.copy(alpha = 0.7f),
        label = "dirToggleBg"
    )

    Row(
        modifier = Modifier
            .graphicsLayer { scaleX = scale; scaleY = scale }
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, if (isFocused) WaveStreamColors.Accent else Color.Transparent, RoundedCornerShape(8.dp))
            .background(background)
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onToggle)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Icon(
            imageVector = if (direction == SortDirection.ASC) Icons.Default.ArrowUpward else Icons.Default.ArrowDownward,
            contentDescription = null,
            tint = WaveStreamColors.Accent,
            modifier = Modifier.size(18.dp)
        )
        Text(
            text = if (direction == SortDirection.ASC) "Cresc." else "Decresc.",
            style = MaterialTheme.typography.labelLarge,
            color = WaveStreamColors.TextPrimary,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
private fun FilterToggleButton(
    activeCount: Int,
    expanded: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val scale by animateFloatAsState(if (isFocused) 1.05f else 1f, label = "filterToggleScale")
    val background by animateColorAsState(
        targetValue = when {
            expanded -> WaveStreamColors.Accent.copy(alpha = 0.30f)
            isFocused -> WaveStreamColors.BackgroundTertiary
            else -> WaveStreamColors.BackgroundSecondary.copy(alpha = 0.7f)
        },
        label = "filterToggleBg"
    )

    Row(
        modifier = Modifier
            .graphicsLayer { scaleX = scale; scaleY = scale }
            .clip(RoundedCornerShape(8.dp))
            .border(
                2.dp,
                if (isFocused || expanded) WaveStreamColors.Accent else Color.Transparent,
                RoundedCornerShape(8.dp)
            )
            .background(background)
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Icon(
            imageVector = Icons.Default.FilterList,
            contentDescription = "Filtri",
            tint = if (activeCount > 0 || isFocused) WaveStreamColors.Accent else WaveStreamColors.TextSecondary,
            modifier = Modifier.size(18.dp)
        )
        Text(
            text = if (activeCount > 0) "Filtri ($activeCount)" else "Filtri",
            style = MaterialTheme.typography.labelLarge,
            color = WaveStreamColors.TextPrimary,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
private fun FilterPanel(
    state: SortFilterState,
    onStateChange: (SortFilterState) -> Unit,
    onClose: () -> Unit,
    availableCategories: List<String>,
    showCategoryFilter: Boolean
) {
    val currentYear = remember { Calendar.getInstance().get(Calendar.YEAR) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp)
            .clip(RoundedCornerShape(12.dp))
            .border(1.dp, WaveStreamColors.SurfaceBorder, RoundedCornerShape(12.dp))
            .background(WaveStreamColors.BackgroundElevated.copy(alpha = 0.94f))
            .padding(16.dp)
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text(
                text = "Filtra risultati",
                style = MaterialTheme.typography.titleSmall,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Bold
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                StepperControl(
                    label = "Anno da",
                    valueText = state.filter.yearFrom?.toString() ?: "Qualsiasi",
                    onDecrease = {
                        val base = state.filter.yearFrom ?: (state.filter.yearTo ?: currentYear)
                        onStateChange(state.copy(filter = state.filter.copy(yearFrom = (base - 1).coerceAtLeast(1900)).normalized()))
                    },
                    onIncrease = {
                        val base = state.filter.yearFrom ?: (state.filter.yearTo ?: (currentYear - 1))
                        onStateChange(state.copy(filter = state.filter.copy(yearFrom = (base + 1).coerceAtMost(currentYear + 1)).normalized()))
                    }
                )

                StepperControl(
                    label = "Anno a",
                    valueText = state.filter.yearTo?.toString() ?: "Qualsiasi",
                    onDecrease = {
                        val base = state.filter.yearTo ?: (state.filter.yearFrom ?: currentYear)
                        onStateChange(state.copy(filter = state.filter.copy(yearTo = (base - 1).coerceAtLeast(1900)).normalized()))
                    },
                    onIncrease = {
                        val base = state.filter.yearTo ?: (state.filter.yearFrom ?: currentYear)
                        onStateChange(state.copy(filter = state.filter.copy(yearTo = (base + 1).coerceAtMost(currentYear + 1)).normalized()))
                    }
                )

                StepperControl(
                    label = "Voto TMDB min",
                    valueText = state.filter.minRating?.let { String.format("%.1f", it) } ?: "Qualsiasi",
                    onDecrease = {
                        val next = ((state.filter.minRating ?: 0.5f) - 0.5f).coerceAtLeast(0f)
                        onStateChange(state.copy(filter = state.filter.copy(minRating = next.takeIf { it > 0f })))
                    },
                    onIncrease = {
                        val next = ((state.filter.minRating ?: -0.5f) + 0.5f).coerceAtMost(10f)
                        onStateChange(state.copy(filter = state.filter.copy(minRating = next)))
                    }
                )
            }

            if (showCategoryFilter && availableCategories.isNotEmpty()) {
                CategoryFilterDropdown(
                    availableCategories = availableCategories,
                    selected = state.filter.categories,
                    onToggle = { cat ->
                        val next = state.filter.categories.toMutableSet()
                        if (!next.add(cat)) next.remove(cat)
                        onStateChange(
                            state.copy(filter = state.filter.copy(categories = next))
                        )
                    }
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                SmallActionButton(
                    label = "Azzera filtri",
                    icon = Icons.Default.Refresh,
                    enabled = state.filter.isActive,
                    onClick = { onStateChange(state.copy(filter = ContentFilterState())) }
                )
                SmallActionButton(
                    label = "Chiudi",
                    icon = Icons.Default.Close,
                    enabled = true,
                    onClick = onClose
                )
            }
        }
    }
}

/**
 * Menu a tendina per selezionare le categorie tramite checkbox.
 * Il pulsante mostra quante categorie sono attive; la lista si espande sotto.
 */
@Composable
private fun CategoryFilterDropdown(
    availableCategories: List<String>,
    selected: Set<String>,
    onToggle: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    val background by animateColorAsState(
        targetValue = when {
            expanded -> WaveStreamColors.Accent.copy(alpha = 0.30f)
            isFocused -> WaveStreamColors.BackgroundTertiary
            else -> WaveStreamColors.BackgroundSecondary.copy(alpha = 0.7f)
        },
        label = "catDropdownBg"
    )
    val border by animateColorAsState(
        targetValue = if (isFocused || expanded) WaveStreamColors.Accent else Color.Transparent,
        label = "catDropdownBorder"
    )

    Column {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .border(2.dp, border, RoundedCornerShape(8.dp))
                .background(background)
                .focusable(interactionSource = interactionSource)
                .clickable(interactionSource = interactionSource, indication = null) {
                    expanded = !expanded
                }
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Icon(
                imageVector = Icons.Default.FilterList,
                contentDescription = null,
                tint = if (selected.isNotEmpty() || isFocused) WaveStreamColors.Accent else WaveStreamColors.TextSecondary,
                modifier = Modifier.size(18.dp)
            )
            Text(
                text = if (selected.isEmpty()) "Categorie" else "Categorie (${selected.size})",
                style = MaterialTheme.typography.labelLarge,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.Medium
            )
            Icon(
                imageVector = if (expanded) Icons.Default.ArrowDropUp else Icons.Default.ArrowDropDown,
                contentDescription = null,
                tint = WaveStreamColors.TextSecondary,
                modifier = Modifier.size(18.dp)
            )
        }

        AnimatedVisibility(visible = expanded) {
            Box(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .border(1.dp, WaveStreamColors.SurfaceBorder, RoundedCornerShape(12.dp))
                    .background(WaveStreamColors.BackgroundElevated.copy(alpha = 0.98f))
            ) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 260.dp),
                    contentPadding = PaddingValues(8.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    items(availableCategories) { cat ->
                        CategoryCheckboxRow(
                            label = cat,
                            checked = cat in selected,
                            onToggle = { onToggle(cat) }
                        )
                    }
                }
            }
        }
    }
}

/** Riga categoria con checkbox, a tutta larghezza (menu a tendina). */
@Composable
private fun CategoryCheckboxRow(
    label: String,
    checked: Boolean,
    onToggle: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val background by animateColorAsState(
        targetValue = when {
            isFocused -> WaveStreamColors.BackgroundTertiary
            checked -> WaveStreamColors.Accent.copy(alpha = 0.18f)
            else -> Color.Transparent
        },
        label = "catRowBg"
    )
    val border by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else Color.Transparent,
        label = "catRowBorder"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, border, RoundedCornerShape(8.dp))
            .background(background)
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onToggle)
            .padding(horizontal = 12.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Icon(
            imageVector = if (checked) Icons.Default.CheckBox else Icons.Default.CheckBoxOutlineBlank,
            contentDescription = null,
            tint = if (checked || isFocused) WaveStreamColors.Accent else WaveStreamColors.TextTertiary,
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = WaveStreamColors.TextPrimary,
            fontWeight = if (checked) FontWeight.Bold else FontWeight.Medium,
            maxLines = 1,
            overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis
        )
    }
}

@Composable
private fun StepperControl(
    label: String,
    valueText: String,
    onDecrease: () -> Unit,
    onIncrease: () -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = WaveStreamColors.TextTertiary
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            StepButton(symbol = "−", onClick = onDecrease)
            Text(
                text = valueText,
                style = MaterialTheme.typography.bodyMedium,
                color = WaveStreamColors.TextPrimary,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.width(84.dp)
            )
            StepButton(symbol = "+", onClick = onIncrease)
        }
    }
}

@Composable
private fun StepButton(symbol: String, onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val background by animateColorAsState(
        targetValue = if (isFocused) WaveStreamColors.Accent else WaveStreamColors.BackgroundSecondary,
        label = "stepBg"
    )

    Box(
        modifier = Modifier
            .size(34.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(background)
            .border(2.dp, if (isFocused) WaveStreamColors.Accent else WaveStreamColors.SurfaceBorder, RoundedCornerShape(8.dp))
            .focusable(interactionSource = interactionSource)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = symbol,
            style = MaterialTheme.typography.titleMedium,
            color = if (isFocused) Color.White else WaveStreamColors.TextPrimary,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun SmallActionButton(
    label: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    enabled: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val background by animateColorAsState(
        targetValue = if (isFocused && enabled) WaveStreamColors.Accent.copy(alpha = 0.25f) else Color.Transparent,
        label = "smallActionBg"
    )

    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .border(1.dp, if (isFocused && enabled) WaveStreamColors.Accent else WaveStreamColors.SurfaceBorder, RoundedCornerShape(8.dp))
            .background(background)
            .focusable(enabled = enabled, interactionSource = interactionSource)
            .clickable(enabled = enabled, interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = if (enabled) WaveStreamColors.TextSecondary else WaveStreamColors.TextDisabled,
            modifier = Modifier.size(16.dp)
        )
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = if (enabled) WaveStreamColors.TextPrimary else WaveStreamColors.TextDisabled
        )
    }
}
